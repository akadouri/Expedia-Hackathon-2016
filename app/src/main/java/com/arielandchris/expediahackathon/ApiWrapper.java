package com.arielandchris.expediahackathon;

import com.arielandchris.expediahackathon.model.GeoSearch;
import com.google.gson.Gson;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;
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
                @Query("type") String type
        );
    }

    private final String API_KEY;
    private Gson gson;
    private ExpediaInterface service;

    public ApiWrapper(String apiKey) {
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

    public GeoSearch geoSearch(String within, String lat, String lng, String type, Callback<List<GeoSearch>> callback) {

        service.geoSearch(within, lat, lng, type);
        Call<List<GeoSearch>> call = service.geoSearch(within, lat, lng, type);
        call.enqueue(callback);
        return null;
    }

    public String thingsToDo(String searchTerm) {
        return thingsToDo(searchTerm, "none", "none");
    }

    public String thingsToDo(String searchTerm, String startDate, String endDate) {
        return "fddasf";

    }

}
