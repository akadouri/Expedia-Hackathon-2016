package com.arielandchris.expediahackathon;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.arielandchris.expediahackathon.model.Airport;
import com.arielandchris.expediahackathon.model.Deals;
import com.arielandchris.expediahackathon.model.GeoSearch;
import com.arielandchris.expediahackathon.model.UnrealDeals;
import com.arielandchris.expediahackathon.model.t2d.Activity;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by Chris on 1/30/2016.
 */
// Flight Search
// http://terminal2.expedia.com:80/x/mflights/search?departureDate=2016-02-2&departureAirport=SEA&arrivalAirport=JFK
// Things to do
// http://terminal2.expedia.com:80/x/activities/search?location=London&startDate=2015-08-08&endDate=2015-08-18
// GeoSearch
// http://terminal2.expedia.com:80/x/geo/features?within=50km&lat=37.777363&lng=-122.453269&type=airport
public class ApiWrapper {

    private interface ExpediaInterface {
        @GET("geo/features")
        Call<List<GeoSearch>> geoSearch(
                @Query("within") String within,
                @Query("lat") String lat,
                @Query("lng") String lng,
                @Query("type") String type,
                @Header("Authorization") String apiKey
        );

        @GET("activities/search")
        Call<List<Activity>> activitySearch(
                @Query("location") String location,
                @Query("startDate") String startDate,
                @Query("endDate") String endDate,
                @Header("Authorization") String apiKey
        );

        @GET("deals/packages")
        Call<UnrealDeals> unrealDeals(
                @Query("originTLA") String originTLA,
                @Query("destinationTLA") String destinationTLA,
                @Query("startDate") String startDate, // yyyy-mm-dd
                @Query("endDate") String endDate,
                @Query("lengthOfStay") String lengthOfStay,
                @Header("Authorization") String apiKey
        );

    }

    private final String API_KEY;
    private Gson gson;
    private ExpediaInterface service;
    private static ApiWrapper instance;
    public List<Deals> unrealDealses; // Dealses <--- Nice. Gonna go to the api branch to play around with stuff

    private ApiWrapper(String apiKey) {
        unrealDealses = new ArrayList<>();
        API_KEY = apiKey;
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        // add your other interceptors …

        // add logging as last interceptor
        httpClient.addInterceptor(logging);  // <-- this is the important line!


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://terminal2.expedia.com:80/x/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        gson = new Gson();
        service = retrofit.create(ExpediaInterface.class);
    }

    public static ApiWrapper getInstance(String apiKey) {
        if(instance == null) {
            instance = new ApiWrapper(apiKey);
        }
        return instance;
    }

    public GeoSearch geoSearch(String within, String lat, String lng, String type, Callback<List<GeoSearch>> callback) {
        //service.geoSearch(within, lat, lng, type, API_KEY);
        Call<List<GeoSearch>> call = service.geoSearch(within, lat, lng, type, "expedia-apikey key=" + API_KEY);
        call.enqueue(callback);
        return null;
    }

    public String thingsToDo(String searchTerm, Callback<List<Activity>> callback) {
        return thingsToDo(searchTerm, "", "", callback);
    }

    public String thingsToDo(String searchTerm, String startDate, String endDate, Callback<List<Activity>> callback) {
        Call<List<Activity>> call = service.activitySearch(searchTerm, startDate, endDate, "expedia-apikey key=" + API_KEY);
        call.enqueue(callback);
        return null;
    }

    public String unrealDeals(String originTLA, String destTLA, String startDate, String endDate, String lengthOfStay) {
        Call<UnrealDeals> call = service.unrealDeals(originTLA, destTLA, startDate, endDate, lengthOfStay, "expedia-apikey key=" + API_KEY);
        call.enqueue(new Callback<UnrealDeals>() {
            @Override
            public void onResponse(Response<UnrealDeals> response) {
                ApiWrapper.getInstance("").unrealDealses.add(response.body().getDeals());
                Log.d("here", "pcks: " + response.body().getDeals().getPackages().size());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("here", "failed");
                Log.d("here", t.getCause().toString());
            }
        });
        return null;
    }

    public static ArrayList<Airport> getAirportsByDist(Context context, String origin) {
        AssetManager am = context.getAssets();
        StringBuilder sb = null;
        ArrayList<Airport> airportList = new ArrayList<Airport>();
        Airport originAP = getAirportByCode(context, origin);
        if (originAP == null) return null; // THROW AN ERROR OR DO THIS <--
        try {
            BufferedReader br =  new BufferedReader(new InputStreamReader(am.open("validAirports.txt")));
            sb = new StringBuilder();
            String mLine = br.readLine();
            while (mLine != null) {
                String lat, lng, code;
                String[] arr = mLine.split(",");
                lat = arr[6];
                lng = arr[7];
                code = arr[4];
                code = code.replace("\"","");
                String cityName = arr[2].replace("\"","");
                Airport toAdd = new Airport(code, Double.parseDouble(lat) - originAP.getLat(), Double.parseDouble(lng) - originAP.getLng());
                toAdd.setOrigDist(Double.parseDouble(lat), Double.parseDouble(lng), originAP.getLat(), originAP.getLng());
                String airportName = arr[1].replace("\"","");
                toAdd.setCityName(cityName);
                toAdd.setAirportName(airportName);
                airportList.add(toAdd);
                mLine = br.readLine();
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Collections.sort(airportList);
        return airportList;
    }

    public static Airport getAirportByCode(Context context, String code) {
        AssetManager am = context.getAssets();
        StringBuilder sb = null;
        try {
            BufferedReader br =  new BufferedReader(new InputStreamReader(am.open("validAirports.txt")));
            sb = new StringBuilder();
            String mLine = br.readLine();
            while (mLine != null) {
                String[] arr = mLine.split(",");
                String apc = arr[4].replace("\"","");
                if (!apc.equalsIgnoreCase(code)) {
                    mLine = br.readLine();
                } else {
                    br.close();
                    String airportName = arr[1].replace("\"","");
                    Airport rtn = new Airport(apc, arr[6], arr[7]);
                    rtn.setAirportName(airportName);
                    return rtn;
                }
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
