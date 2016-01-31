
package com.arielandchris.expediahackathon.model.pkgs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightItinerary {

    @SerializedName("FlightLeg")
    @Expose
    private List<com.arielandchris.expediahackathon.model.pkgs.FlightLeg> FlightLeg = new ArrayList<com.arielandchris.expediahackathon.model.pkgs.FlightLeg>();

    /**
     * 
     * @return
     *     The FlightLeg
     */
    public List<com.arielandchris.expediahackathon.model.pkgs.FlightLeg> getFlightLeg() {
        return FlightLeg;
    }

    /**
     * 
     * @param FlightLeg
     *     The FlightLeg
     */
    public void setFlightLeg(List<com.arielandchris.expediahackathon.model.pkgs.FlightLeg> FlightLeg) {
        this.FlightLeg = FlightLeg;
    }

}
