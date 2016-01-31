
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Packages {

    @SerializedName("PackageSearchResultList")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.PackageSearchResultList PackageSearchResultList;
    @SerializedName("FlightList")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.FlightList FlightList;
    @SerializedName("HotelList")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.HotelList HotelList;

    /**
     * 
     * @return
     *     The PackageSearchResultList
     */
    public com.arielandchris.expediahackathon.model.pkgs.PackageSearchResultList getPackageSearchResultList() {
        return PackageSearchResultList;
    }

    /**
     * 
     * @param PackageSearchResultList
     *     The PackageSearchResultList
     */
    public void setPackageSearchResultList(com.arielandchris.expediahackathon.model.pkgs.PackageSearchResultList PackageSearchResultList) {
        this.PackageSearchResultList = PackageSearchResultList;
    }

    /**
     * 
     * @return
     *     The FlightList
     */
    public com.arielandchris.expediahackathon.model.pkgs.FlightList getFlightList() {
        return FlightList;
    }

    /**
     * 
     * @param FlightList
     *     The FlightList
     */
    public void setFlightList(com.arielandchris.expediahackathon.model.pkgs.FlightList FlightList) {
        this.FlightList = FlightList;
    }

    /**
     * 
     * @return
     *     The HotelList
     */
    public com.arielandchris.expediahackathon.model.pkgs.HotelList getHotelList() {
        return HotelList;
    }

    /**
     * 
     * @param HotelList
     *     The HotelList
     */
    public void setHotelList(com.arielandchris.expediahackathon.model.pkgs.HotelList HotelList) {
        this.HotelList = HotelList;
    }

}
