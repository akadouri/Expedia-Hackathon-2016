package com.arielandchris.expediahackathon;

import com.google.gson.Gson;

import retrofit2.Retrofit;

/**
 * Created by Chris on 1/30/2016.
 */
// Flight Search
// http://terminal2.expedia.com:80/x/mflights/search?departureDate=2016-02-2&departureAirport=SEA&arrivalAirport=JFK
// Things to do
// http://terminal2.expedia.com:80/x/activities/search?location=London&startDate=2015-08-08&endDate=2015-08-18
// http://terminal2.expedia.com:80/x/geo/features?within=50km&lat=37.777363&lng=-122.453269&type=airport
public class ApiWrapper {
    private static final string API_KEY;
    private Gson gson;
    public ApiWrapper() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://terminal2.expedia.com:80/x/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        gson = new Gson();
    }

    public GeoSearch geoSearch(String )

    public String thingsToDo(String searchTerm) {
        thingsToDo(searchTerm, "none", "none");
    }
    public String thingsToDo(String searchTerm, String startDate, String endDate) {

        return "temp";
    }
}
