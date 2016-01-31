
package com.arielandchris.expediahackathon.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Package {

    @SerializedName("hotelId")
    @Expose
    private Integer hotelId;
    @SerializedName("originTLA")
    @Expose
    private String originTLA;
    @SerializedName("destinationTLA")
    @Expose
    private String destinationTLA;
    @SerializedName("expiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("marker")
    @Expose
    private List<Marker> marker = new ArrayList<Marker>();
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("comparableProduct")
    @Expose
    private ComparableProduct comparableProduct;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("totalPackagePrice")
    @Expose
    private Double totalPackagePrice;
    @SerializedName("totalPackageSavings")
    @Expose
    private Double totalPackageSavings;
    @SerializedName("totalPackageSavingsPct")
    @Expose
    private Double totalPackageSavingsPct;
    @SerializedName("packageStartDate")
    @Expose
    private String packageStartDate;
    @SerializedName("packageEndDate")
    @Expose
    private String packageEndDate;
    @SerializedName("checkInDate")
    @Expose
    private String checkInDate;
    @SerializedName("checkOutDate")
    @Expose
    private String checkOutDate;
    @SerializedName("saLodgingBase")
    @Expose
    private Double saLodgingBase
            ;
    @SerializedName("saLodgingTaxesAndFees")
    @Expose
    private Double saLodgingTaxesAndFees;
    @SerializedName("saAirBase")
    @Expose
    private Double saAirBase;
    @SerializedName("saAirTaxesAndFees")
    @Expose
    private Double saAirTaxesAndFees;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;

    /**
     * 
     * @return
     *     The hotelId
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * 
     * @param hotelId
     *     The hotelId
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 
     * @return
     *     The originTLA
     */
    public String getOriginTLA() {
        return originTLA;
    }

    /**
     * 
     * @param originTLA
     *     The originTLA
     */
    public void setOriginTLA(String originTLA) {
        this.originTLA = originTLA;
    }

    /**
     * 
     * @return
     *     The destinationTLA
     */
    public String getDestinationTLA() {
        return destinationTLA;
    }

    /**
     * 
     * @param destinationTLA
     *     The destinationTLA
     */
    public void setDestinationTLA(String destinationTLA) {
        this.destinationTLA = destinationTLA;
    }

    /**
     * 
     * @return
     *     The expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * 
     * @param expiryDate
     *     The expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * 
     * @return
     *     The marker
     */
    public List<Marker> getMarker() {
        return marker;
    }

    /**
     * 
     * @param marker
     *     The marker
     */
    public void setMarker(List<Marker> marker) {
        this.marker = marker;
    }

    /**
     * 
     * @return
     *     The product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 
     * @param product
     *     The product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * 
     * @return
     *     The comparableProduct
     */
    public ComparableProduct getComparableProduct() {
        return comparableProduct;
    }

    /**
     * 
     * @param comparableProduct
     *     The comparableProduct
     */
    public void setComparableProduct(ComparableProduct comparableProduct) {
        this.comparableProduct = comparableProduct;
    }

    /**
     * 
     * @return
     *     The currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * @param currencyCode
     *     The currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 
     * @return
     *     The totalPackagePrice
     */
    public Double getTotalPackagePrice() {
        return totalPackagePrice;
    }

    /**
     * 
     * @param totalPackagePrice
     *     The totalPackagePrice
     */
    public void setTotalPackagePrice(Double totalPackagePrice) {
        this.totalPackagePrice = totalPackagePrice;
    }

    /**
     * 
     * @return
     *     The totalPackageSavings
     */
    public Double getTotalPackageSavings() {
        return totalPackageSavings;
    }

    /**
     * 
     * @param totalPackageSavings
     *     The totalPackageSavings
     */
    public void setTotalPackageSavings(Double totalPackageSavings) {
        this.totalPackageSavings = totalPackageSavings;
    }

    /**
     * 
     * @return
     *     The totalPackageSavingsPct
     */
    public Double getTotalPackageSavingsPct() {
        return totalPackageSavingsPct;
    }

    /**
     * 
     * @param totalPackageSavingsPct
     *     The totalPackageSavingsPct
     */
    public void setTotalPackageSavingsPct(Double totalPackageSavingsPct) {
        this.totalPackageSavingsPct = totalPackageSavingsPct;
    }

    /**
     * 
     * @return
     *     The packageStartDate
     */
    public String getPackageStartDate() {
        return packageStartDate;
    }

    /**
     * 
     * @param packageStartDate
     *     The packageStartDate
     */
    public void setPackageStartDate(String packageStartDate) {
        this.packageStartDate = packageStartDate;
    }

    /**
     * 
     * @return
     *     The packageEndDate
     */
    public String getPackageEndDate() {
        return packageEndDate;
    }

    /**
     * 
     * @param packageEndDate
     *     The packageEndDate
     */
    public void setPackageEndDate(String packageEndDate) {
        this.packageEndDate = packageEndDate;
    }

    /**
     * 
     * @return
     *     The checkInDate
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * 
     * @param checkInDate
     *     The checkInDate
     */
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * 
     * @return
     *     The checkOutDate
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * 
     * @param checkOutDate
     *     The checkOutDate
     */
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    /**
     * 
     * @return
     *     The saLodgingBase
     */
    public Double getSaLodgingBase() {
        return saLodgingBase;
    }

    /**
     * 
     * @param saLodgingBase
     *     The saLodgingBase
     */
    public void setSaLodgingBase(Double saLodgingBase) {
        this.saLodgingBase = saLodgingBase;
    }

    /**
     * 
     * @return
     *     The saLodgingTaxesAndFees
     */
    public Double getSaLodgingTaxesAndFees() {
        return saLodgingTaxesAndFees;
    }

    /**
     * 
     * @param saLodgingTaxesAndFees
     *     The saLodgingTaxesAndFees
     */
    public void setSaLodgingTaxesAndFees(Double saLodgingTaxesAndFees) {
        this.saLodgingTaxesAndFees = saLodgingTaxesAndFees;
    }

    /**
     * 
     * @return
     *     The saAirBase
     */
    public Double getSaAirBase() {
        return saAirBase;
    }

    /**
     * 
     * @param saAirBase
     *     The saAirBase
     */
    public void setSaAirBase(Double saAirBase) {
        this.saAirBase = saAirBase;
    }

    /**
     * 
     * @return
     *     The saAirTaxesAndFees
     */
    public Double getSaAirTaxesAndFees() {
        return saAirTaxesAndFees;
    }

    /**
     * 
     * @param saAirTaxesAndFees
     *     The saAirTaxesAndFees
     */
    public void setSaAirTaxesAndFees(Double saAirTaxesAndFees) {
        this.saAirTaxesAndFees = saAirTaxesAndFees;
    }

    /**
     * 
     * @return
     *     The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     * 
     * @param deeplink
     *     The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

}
