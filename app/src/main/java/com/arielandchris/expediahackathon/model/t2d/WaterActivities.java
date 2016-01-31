
package com.arielandchris.expediahackathon.model.t2d;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WaterActivities {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;
    @SerializedName("contextualDisplayValue")
    @Expose
    private String contextualDisplayValue;

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * 
     * @param displayValue
     *     The displayValue
     */
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * 
     * @return
     *     The contextualDisplayValue
     */
    public String getContextualDisplayValue() {
        return contextualDisplayValue;
    }

    /**
     * 
     * @param contextualDisplayValue
     *     The contextualDisplayValue
     */
    public void setContextualDisplayValue(String contextualDisplayValue) {
        this.contextualDisplayValue = contextualDisplayValue;
    }

}
