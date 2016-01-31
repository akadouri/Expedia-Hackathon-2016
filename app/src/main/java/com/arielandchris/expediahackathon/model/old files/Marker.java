
package com.arielandchris.expediahackathon.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Marker {

    @SerializedName("sticker")
    @Expose
    private String sticker;
    @SerializedName("magnitude")
    @Expose
    private String magnitude;
    @SerializedName("token")
    @Expose
    private String token;

    /**
     * 
     * @return
     *     The sticker
     */
    public String getSticker() {
        return sticker;
    }

    /**
     * 
     * @param sticker
     *     The sticker
     */
    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    /**
     * 
     * @return
     *     The magnitude
     */
    public String getMagnitude() {
        return magnitude;
    }

    /**
     * 
     * @param magnitude
     *     The magnitude
     */
    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    /**
     * 
     * @return
     *     The token
     */
    public String getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    public void setToken(String token) {
        this.token = token;
    }

}
