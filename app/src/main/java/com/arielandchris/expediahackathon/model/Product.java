
package com.arielandchris.expediahackathon.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("ratePlanCode")
    @Expose
    private String ratePlanCode;
    @SerializedName("roomTypeCode")
    @Expose
    private String roomTypeCode;

    /**
     * 
     * @return
     *     The ratePlanCode
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 
     * @param ratePlanCode
     *     The ratePlanCode
     */
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    /**
     * 
     * @return
     *     The roomTypeCode
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 
     * @param roomTypeCode
     *     The roomTypeCode
     */
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

}
