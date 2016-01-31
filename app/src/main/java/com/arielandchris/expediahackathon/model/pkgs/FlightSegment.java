
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightSegment {

    @SerializedName("FlightSegmentIndex")
    @Expose
    private String FlightSegmentIndex;
    @SerializedName("DepartureAirportCode")
    @Expose
    private String DepartureAirportCode;
    @SerializedName("ArrivalAirportCode")
    @Expose
    private String ArrivalAirportCode;
    @SerializedName("DepartureDateTime")
    @Expose
    private String DepartureDateTime;
    @SerializedName("ArrivalDateTime")
    @Expose
    private String ArrivalDateTime;
    @SerializedName("CarrierCode")
    @Expose
    private String CarrierCode;
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;
    @SerializedName("FlightDuration")
    @Expose
    private String FlightDuration;

    /**
     * 
     * @return
     *     The FlightSegmentIndex
     */
    public String getFlightSegmentIndex() {
        return FlightSegmentIndex;
    }

    /**
     * 
     * @param FlightSegmentIndex
     *     The FlightSegmentIndex
     */
    public void setFlightSegmentIndex(String FlightSegmentIndex) {
        this.FlightSegmentIndex = FlightSegmentIndex;
    }

    /**
     * 
     * @return
     *     The DepartureAirportCode
     */
    public String getDepartureAirportCode() {
        return DepartureAirportCode;
    }

    /**
     * 
     * @param DepartureAirportCode
     *     The DepartureAirportCode
     */
    public void setDepartureAirportCode(String DepartureAirportCode) {
        this.DepartureAirportCode = DepartureAirportCode;
    }

    /**
     * 
     * @return
     *     The ArrivalAirportCode
     */
    public String getArrivalAirportCode() {
        return ArrivalAirportCode;
    }

    /**
     * 
     * @param ArrivalAirportCode
     *     The ArrivalAirportCode
     */
    public void setArrivalAirportCode(String ArrivalAirportCode) {
        this.ArrivalAirportCode = ArrivalAirportCode;
    }

    /**
     * 
     * @return
     *     The DepartureDateTime
     */
    public String getDepartureDateTime() {
        return DepartureDateTime;
    }

    /**
     * 
     * @param DepartureDateTime
     *     The DepartureDateTime
     */
    public void setDepartureDateTime(String DepartureDateTime) {
        this.DepartureDateTime = DepartureDateTime;
    }

    /**
     * 
     * @return
     *     The ArrivalDateTime
     */
    public String getArrivalDateTime() {
        return ArrivalDateTime;
    }

    /**
     * 
     * @param ArrivalDateTime
     *     The ArrivalDateTime
     */
    public void setArrivalDateTime(String ArrivalDateTime) {
        this.ArrivalDateTime = ArrivalDateTime;
    }

    /**
     * 
     * @return
     *     The CarrierCode
     */
    public String getCarrierCode() {
        return CarrierCode;
    }

    /**
     * 
     * @param CarrierCode
     *     The CarrierCode
     */
    public void setCarrierCode(String CarrierCode) {
        this.CarrierCode = CarrierCode;
    }

    /**
     * 
     * @return
     *     The FlightNumber
     */
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * 
     * @param FlightNumber
     *     The FlightNumber
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
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

}
