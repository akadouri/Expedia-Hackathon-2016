
package com.arielandchris.expediahackathon.model.t2d;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Activity {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("largeImageURL")
    @Expose
    private String largeImageURL;
    @SerializedName("fromPrice")
    @Expose
    private String fromPrice;
    @SerializedName("fromPriceLabel")
    @Expose
    private String fromPriceLabel;
    @SerializedName("fromOriginalPrice")
    @Expose
    private String fromOriginalPrice;
    @SerializedName("fromOriginalPriceValue")
    @Expose
    private String fromOriginalPriceValue;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("fromPriceTicketType")
    @Expose
    private String fromPriceTicketType;
    @SerializedName("freeCancellation")
    @Expose
    private Boolean freeCancellation;
    @SerializedName("discountPercentage")
    @Expose
    private Object discountPercentage;
    @SerializedName("categories")
    @Expose
    private List<String> categories = new ArrayList<String>();
    @SerializedName("latLng")
    @Expose
    private String latLng;
    @SerializedName("redemptionType")
    @Expose
    private String redemptionType;
    @SerializedName("supplierName")
    @Expose
    private String supplierName;
    @SerializedName("recommendationScore")
    @Expose
    private Integer recommendationScore;
    @SerializedName("discountType")
    @Expose
    private Object discountType;
    @SerializedName("shortDescription")
    @Expose
    private Object shortDescription;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The largeImageURL
     */
    public String getLargeImageURL() {
        return largeImageURL;
    }

    /**
     * 
     * @param largeImageURL
     *     The largeImageURL
     */
    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    /**
     * 
     * @return
     *     The fromPrice
     */
    public String getFromPrice() {
        return fromPrice;
    }

    /**
     * 
     * @param fromPrice
     *     The fromPrice
     */
    public void setFromPrice(String fromPrice) {
        this.fromPrice = fromPrice;
    }

    /**
     * 
     * @return
     *     The fromPriceLabel
     */
    public String getFromPriceLabel() {
        return fromPriceLabel;
    }

    /**
     * 
     * @param fromPriceLabel
     *     The fromPriceLabel
     */
    public void setFromPriceLabel(String fromPriceLabel) {
        this.fromPriceLabel = fromPriceLabel;
    }

    /**
     * 
     * @return
     *     The fromOriginalPrice
     */
    public String getFromOriginalPrice() {
        return fromOriginalPrice;
    }

    /**
     * 
     * @param fromOriginalPrice
     *     The fromOriginalPrice
     */
    public void setFromOriginalPrice(String fromOriginalPrice) {
        this.fromOriginalPrice = fromOriginalPrice;
    }

    /**
     * 
     * @return
     *     The fromOriginalPriceValue
     */
    public String getFromOriginalPriceValue() {
        return fromOriginalPriceValue;
    }

    /**
     * 
     * @param fromOriginalPriceValue
     *     The fromOriginalPriceValue
     */
    public void setFromOriginalPriceValue(String fromOriginalPriceValue) {
        this.fromOriginalPriceValue = fromOriginalPriceValue;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The fromPriceTicketType
     */
    public String getFromPriceTicketType() {
        return fromPriceTicketType;
    }

    /**
     * 
     * @param fromPriceTicketType
     *     The fromPriceTicketType
     */
    public void setFromPriceTicketType(String fromPriceTicketType) {
        this.fromPriceTicketType = fromPriceTicketType;
    }

    /**
     * 
     * @return
     *     The freeCancellation
     */
    public Boolean getFreeCancellation() {
        return freeCancellation;
    }

    /**
     * 
     * @param freeCancellation
     *     The freeCancellation
     */
    public void setFreeCancellation(Boolean freeCancellation) {
        this.freeCancellation = freeCancellation;
    }

    /**
     * 
     * @return
     *     The discountPercentage
     */
    public Object getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * 
     * @param discountPercentage
     *     The discountPercentage
     */
    public void setDiscountPercentage(Object discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The latLng
     */
    public String getLatLng() {
        return latLng;
    }

    /**
     * 
     * @param latLng
     *     The latLng
     */
    public void setLatLng(String latLng) {
        this.latLng = latLng;
    }

    /**
     * 
     * @return
     *     The redemptionType
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * 
     * @param redemptionType
     *     The redemptionType
     */
    public void setRedemptionType(String redemptionType) {
        this.redemptionType = redemptionType;
    }

    /**
     * 
     * @return
     *     The supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 
     * @param supplierName
     *     The supplierName
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 
     * @return
     *     The recommendationScore
     */
    public Integer getRecommendationScore() {
        return recommendationScore;
    }

    /**
     * 
     * @param recommendationScore
     *     The recommendationScore
     */
    public void setRecommendationScore(Integer recommendationScore) {
        this.recommendationScore = recommendationScore;
    }

    /**
     * 
     * @return
     *     The discountType
     */
    public Object getDiscountType() {
        return discountType;
    }

    /**
     * 
     * @param discountType
     *     The discountType
     */
    public void setDiscountType(Object discountType) {
        this.discountType = discountType;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    public Object getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The shortDescription
     */
    public void setShortDescription(Object shortDescription) {
        this.shortDescription = shortDescription;
    }

}
