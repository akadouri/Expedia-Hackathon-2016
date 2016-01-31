package com.arielandchris.expediahackathon.model;

/**
 * Created by Chris on 1/30/2016.
 */
public class Airport implements Comparable<Airport>{
    private String code;
    private double lat, lng;
    public Airport(String key, String lat, String lng) {
        this(key, Double.parseDouble(lat), Double.parseDouble(lng));
    }
    public Airport(String code, double lat, double lng) {
        this.code = code;
        this.lat = lat;
        this.lng = lng;
    }
    private double dist() {
        return Math.sqrt(Math.pow(this.lat,2) + Math.pow(this.lng,2));
    }

    public int compareTo(Airport other) {
        return (int)(this.dist() - other.dist());
    }
    public double getLat() {
        return this.lat;
    }
    public double getLng() {
        return this.lng;
    }
    public String getCode() {
        return this.code;
    }
}