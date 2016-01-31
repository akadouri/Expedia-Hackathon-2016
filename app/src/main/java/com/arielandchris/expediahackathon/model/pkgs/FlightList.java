
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightList {

    @SerializedName("Flight")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.Flight Flight;

    /**
     * 
     * @return
     *     The Flight
     */
    public com.arielandchris.expediahackathon.model.pkgs.Flight getFlight() {
        return Flight;
    }

    /**
     * 
     * @param Flight
     *     The Flight
     */
    public void setFlight(com.arielandchris.expediahackathon.model.pkgs.Flight Flight) {
        this.Flight = Flight;
    }

}
