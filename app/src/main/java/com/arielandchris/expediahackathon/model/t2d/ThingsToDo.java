
package com.arielandchris.expediahackathon.model.t2d;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ThingsToDo {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("regionId")
    @Expose
    private String regionId;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("activities")
    @Expose
    private List<Activity> activities = new ArrayList<Activity>();
    @SerializedName("filterCategories")
    @Expose
    private FilterCategories filterCategories;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("startDate")
    @Expose
    private String startDate;

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The regionId
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * 
     * @param regionId
     *     The regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The activities
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * 
     * @param activities
     *     The activities
     */
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    /**
     * 
     * @return
     *     The filterCategories
     */
    public FilterCategories getFilterCategories() {
        return filterCategories;
    }

    /**
     * 
     * @param filterCategories
     *     The filterCategories
     */
    public void setFilterCategories(FilterCategories filterCategories) {
        this.filterCategories = filterCategories;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
