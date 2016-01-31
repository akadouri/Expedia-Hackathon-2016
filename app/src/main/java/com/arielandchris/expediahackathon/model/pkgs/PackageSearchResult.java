
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackageSearchResult {

    @SerializedName("FlightReferenceIndex")
    @Expose
    private String FlightReferenceIndex;
    @SerializedName("HotelReferenceIndex")
    @Expose
    private String HotelReferenceIndex;
    @SerializedName("PackagePrice")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.PackagePrice PackagePrice;
    @SerializedName("DetailsUrl")
    @Expose
    private String DetailsUrl;
    @SerializedName("BrandedDealsMarker")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.BrandedDealsMarker BrandedDealsMarker;

    /**
     * 
     * @return
     *     The FlightReferenceIndex
     */
    public String getFlightReferenceIndex() {
        return FlightReferenceIndex;
    }

    /**
     * 
     * @param FlightReferenceIndex
     *     The FlightReferenceIndex
     */
    public void setFlightReferenceIndex(String FlightReferenceIndex) {
        this.FlightReferenceIndex = FlightReferenceIndex;
    }

    /**
     * 
     * @return
     *     The HotelReferenceIndex
     */
    public String getHotelReferenceIndex() {
        return HotelReferenceIndex;
    }

    /**
     * 
     * @param HotelReferenceIndex
     *     The HotelReferenceIndex
     */
    public void setHotelReferenceIndex(String HotelReferenceIndex) {
        this.HotelReferenceIndex = HotelReferenceIndex;
    }

    /**
     * 
     * @return
     *     The PackagePrice
     */
    public com.arielandchris.expediahackathon.model.pkgs.PackagePrice getPackagePrice() {
        return PackagePrice;
    }

    /**
     * 
     * @param PackagePrice
     *     The PackagePrice
     */
    public void setPackagePrice(com.arielandchris.expediahackathon.model.pkgs.PackagePrice PackagePrice) {
        this.PackagePrice = PackagePrice;
    }

    /**
     * 
     * @return
     *     The DetailsUrl
     */
    public String getDetailsUrl() {
        return DetailsUrl;
    }

    /**
     * 
     * @param DetailsUrl
     *     The DetailsUrl
     */
    public void setDetailsUrl(String DetailsUrl) {
        this.DetailsUrl = DetailsUrl;
    }

    /**
     * 
     * @return
     *     The BrandedDealsMarker
     */
    public com.arielandchris.expediahackathon.model.pkgs.BrandedDealsMarker getBrandedDealsMarker() {
        return BrandedDealsMarker;
    }

    /**
     * 
     * @param BrandedDealsMarker
     *     The BrandedDealsMarker
     */
    public void setBrandedDealsMarker(com.arielandchris.expediahackathon.model.pkgs.BrandedDealsMarker BrandedDealsMarker) {
        this.BrandedDealsMarker = BrandedDealsMarker;
    }

}
