
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("StreetAddress")
    @Expose
    private String StreetAddress;
    @SerializedName("City")
    @Expose
    private String City;
    @SerializedName("Province")
    @Expose
    private String Province;
    @SerializedName("Country")
    @Expose
    private String Country;
    @SerializedName("GeoLocation")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.GeoLocation GeoLocation;

    /**
     * 
     * @return
     *     The StreetAddress
     */
    public String getStreetAddress() {
        return StreetAddress;
    }

    /**
     * 
     * @param StreetAddress
     *     The StreetAddress
     */
    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    /**
     * 
     * @return
     *     The City
     */
    public String getCity() {
        return City;
    }

    /**
     * 
     * @param City
     *     The City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * 
     * @return
     *     The Province
     */
    public String getProvince() {
        return Province;
    }

    /**
     * 
     * @param Province
     *     The Province
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * 
     * @return
     *     The Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * 
     * @param Country
     *     The Country
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * 
     * @return
     *     The GeoLocation
     */
    public com.arielandchris.expediahackathon.model.pkgs.GeoLocation getGeoLocation() {
        return GeoLocation;
    }

    /**
     * 
     * @param GeoLocation
     *     The GeoLocation
     */
    public void setGeoLocation(com.arielandchris.expediahackathon.model.pkgs.GeoLocation GeoLocation) {
        this.GeoLocation = GeoLocation;
    }

}
