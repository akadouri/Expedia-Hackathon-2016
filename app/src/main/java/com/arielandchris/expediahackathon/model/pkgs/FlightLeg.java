
package com.arielandchris.expediahackathon.model.pkgs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightLeg {

    @SerializedName("FlightLegIndex")
    @Expose
    private String FlightLegIndex;
    @SerializedName("FlightDuration")
    @Expose
    private String FlightDuration;
    @SerializedName("FlightSegment")
    @Expose
    private List<com.arielandchris.expediahackathon.model.pkgs.FlightSegment> FlightSegment = new ArrayList<com.arielandchris.expediahackathon.model.pkgs.FlightSegment>();

    /**
     * 
     * @return
     *     The FlightLegIndex
     */
    public String getFlightLegIndex() {
        return FlightLegIndex;
    }

    /**
     * 
     * @param FlightLegIndex
     *     The FlightLegIndex
     */
    public void setFlightLegIndex(String FlightLegIndex) {
        this.FlightLegIndex = FlightLegIndex;
    }

    /**
     * 
     * @return
     *     The FlightDuration
     */
    public String getFlightDuration() {
        return FlightDuration;
    }

    /**
     * 
     * @param FlightDuration
     *     The FlightDuration
     */
    public void setFlightDuration(String FlightDuration) {
        this.FlightDuration = FlightDuration;
    }

    /**
     * 
     * @return
     *     The FlightSegment
     */
    public List<com.arielandchris.expediahackathon.model.pkgs.FlightSegment> getFlightSegment() {
        return FlightSegment;
    }

    /**
     * 
     * @param FlightSegment
     *     The FlightSegment
     */
    public void setFlightSegment(List<com.arielandchris.expediahackathon.model.pkgs.FlightSegment> FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

}
