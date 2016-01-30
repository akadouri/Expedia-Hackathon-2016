package com.arielandchris.expediahackathon;

import android.util.Log;

import com.arielandchris.expediahackathon.model.GeoSearch;
import com.google.gson.Gson;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
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
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://terminal2.expedia.com:80/x/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        gson = new Gson();
        service = retrofit.create(ExpediaInterface.class);
    }

    public GeoSearch geoSearch(String within, String lat, String lng, String type) {

        service.geoSearch(within, lat, lng, type);
        Call<List<GeoSearch>> call = service.geoSearch(within, lat, lng, type);
        call.enqueue(new Callback<List<GeoSearch>>() {
            @Override
            public void onResponse(Response<List<GeoSearch>> response) {
                // Get result Repo from response.body()
                Log.d("ApiWrapper", "Successful Response");
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
        return null;
    }

    public String thingsToDo(String searchTerm) {
        return thingsToDo(searchTerm, "none", "none");
    }
    public String thingsToDo(String searchTerm, String startDate, String endDate) {
        return "fddasf";

    }

}
