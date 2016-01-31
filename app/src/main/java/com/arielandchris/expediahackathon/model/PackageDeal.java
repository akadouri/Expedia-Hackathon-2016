
package com.arielandchris.expediahackathon.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackageDeal {

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
    private Integer totalPackagePrice;
    @SerializedName("totalPackageSavings")
    @Expose
    private Integer totalPackageSavings;
    @SerializedName("totalPackageSavingsPct")
    @Expose
    private Integer totalPackageSavingsPct;
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
    private Integer saLodgingBase;
    @SerializedName("saLodgingTaxesAndFees")
    @Expose
    private Integer saLodgingTaxesAndFees;
    @SerializedName("saAirBase")
    @Expose
    private Integer saAirBase;
    @SerializedName("saAirTaxesAndFees")
    @Expose
    private Integer saAirTaxesAndFees;

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
    public Integer getTotalPackagePrice() {
        return totalPackagePrice;
    }

    /**
     * 
     * @param totalPackagePrice
     *     The totalPackagePrice
     */
    public void setTotalPackagePrice(Integer totalPackagePrice) {
        this.totalPackagePrice = totalPackagePrice;
    }

    /**
     * 
     * @return
     *     The totalPackageSavings
     */
    public Integer getTotalPackageSavings() {
        return totalPackageSavings;
    }

    /**
     * 
     * @param totalPackageSavings
     *     The totalPackageSavings
     */
    public void setTotalPackageSavings(Integer totalPackageSavings) {
        this.totalPackageSavings = totalPackageSavings;
    }

    /**
     * 
     * @return
     *     The totalPackageSavingsPct
     */
    public Integer getTotalPackageSavingsPct() {
        return totalPackageSavingsPct;
    }

    /**
     * 
     * @param totalPackageSavingsPct
     *     The totalPackageSavingsPct
     */
    public void setTotalPackageSavingsPct(Integer totalPackageSavingsPct) {
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
    public Integer getSaLodgingBase() {
        return saLodgingBase;
    }

    /**
     * 
     * @param saLodgingBase
     *     The saLodgingBase
     */
    public void setSaLodgingBase(Integer saLodgingBase) {
        this.saLodgingBase = saLodgingBase;
    }

    /**
     * 
     * @return
     *     The saLodgingTaxesAndFees
     */
    public Integer getSaLodgingTaxesAndFees() {
        return saLodgingTaxesAndFees;
    }

    /**
     * 
     * @param saLodgingTaxesAndFees
     *     The saLodgingTaxesAndFees
     */
    public void setSaLodgingTaxesAndFees(Integer saLodgingTaxesAndFees) {
        this.saLodgingTaxesAndFees = saLodgingTaxesAndFees;
    }

    /**
     * 
     * @return
     *     The saAirBase
     */
    public Integer getSaAirBase() {
        return saAirBase;
    }

    /**
     * 
     * @param saAirBase
     *     The saAirBase
     */
    public void setSaAirBase(Integer saAirBase) {
        this.saAirBase = saAirBase;
    }

    /**
     * 
     * @return
     *     The saAirTaxesAndFees
     */
    public Integer getSaAirTaxesAndFees() {
        return saAirTaxesAndFees;
    }

    /**
     * 
     * @param saAirTaxesAndFees
     *     The saAirTaxesAndFees
     */
    public void setSaAirTaxesAndFees(Integer saAirTaxesAndFees) {
        this.saAirTaxesAndFees = saAirTaxesAndFees;
    }

}
