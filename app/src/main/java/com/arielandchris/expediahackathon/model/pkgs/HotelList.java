
package com.arielandchris.expediahackathon.model.pkgs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelList {

    @SerializedName("CheckInDate")
    @Expose
    private String CheckInDate;
    @SerializedName("CheckOutDate")
    @Expose
    private String CheckOutDate;
    @SerializedName("Hotel")
    @Expose
    private List<com.arielandchris.expediahackathon.model.pkgs.Hotel> Hotel = new ArrayList<com.arielandchris.expediahackathon.model.pkgs.Hotel>();

    /**
     * 
     * @return
     *     The CheckInDate
     */
    public String getCheckInDate() {
        return CheckInDate;
    }

    /**
     * 
     * @param CheckInDate
     *     The CheckInDate
     */
    public void setCheckInDate(String CheckInDate) {
        this.CheckInDate = CheckInDate;
    }

    /**
     * 
     * @return
     *     The CheckOutDate
     */
    public String getCheckOutDate() {
        return CheckOutDate;
    }

    /**
     * 
     * @param CheckOutDate
     *     The CheckOutDate
     */
    public void setCheckOutDate(String CheckOutDate) {
        this.CheckOutDate = CheckOutDate;
    }

    /**
     * 
     * @return
     *     The Hotel
     */
    public List<com.arielandchris.expediahackathon.model.pkgs.Hotel> getHotel() {
        return Hotel;
    }

    /**
     * 
     * @param Hotel
     *     The Hotel
     */
    public void setHotel(List<com.arielandchris.expediahackathon.model.pkgs.Hotel> Hotel) {
        this.Hotel = Hotel;
    }

}
