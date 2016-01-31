
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("FlightIndex")
    @Expose
    private String FlightIndex;
    @SerializedName("FlightItinerary")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.FlightItinerary FlightItinerary;
    @SerializedName("FlightPrice")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.FlightPrice FlightPrice;
    @SerializedName("TicketsRemaining")
    @Expose
    private String TicketsRemaining;

    /**
     * 
     * @return
     *     The FlightIndex
     */
    public String getFlightIndex() {
        return FlightIndex;
    }

    /**
     * 
     * @param FlightIndex
     *     The FlightIndex
     */
    public void setFlightIndex(String FlightIndex) {
        this.FlightIndex = FlightIndex;
    }

    /**
     * 
     * @return
     *     The FlightItinerary
     */
    public com.arielandchris.expediahackathon.model.pkgs.FlightItinerary getFlightItinerary() {
        return FlightItinerary;
    }

    /**
     * 
     * @param FlightItinerary
     *     The FlightItinerary
     */
    public void setFlightItinerary(com.arielandchris.expediahackathon.model.pkgs.FlightItinerary FlightItinerary) {
        this.FlightItinerary = FlightItinerary;
    }

    /**
     * 
     * @return
     *     The FlightPrice
     */
    public com.arielandchris.expediahackathon.model.pkgs.FlightPrice getFlightPrice() {
        return FlightPrice;
    }

    /**
     * 
     * @param FlightPrice
     *     The FlightPrice
     */
    public void setFlightPrice(com.arielandchris.expediahackathon.model.pkgs.FlightPrice FlightPrice) {
        this.FlightPrice = FlightPrice;
    }

    /**
     * 
     * @return
     *     The TicketsRemaining
     */
    public String getTicketsRemaining() {
        return TicketsRemaining;
    }

    /**
     * 
     * @param TicketsRemaining
     *     The TicketsRemaining
     */
    public void setTicketsRemaining(String TicketsRemaining) {
        this.TicketsRemaining = TicketsRemaining;
    }

}
