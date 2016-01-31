package com.arielandchris.expediahackathon.model.t2d;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PrivateTransfers {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;
    @SerializedName("contextualDisplayValue")
    @Expose
    private String contextualDisplayValue;
    @SerializedName("contextualComboDisplayValue")
    @Expose
    private String contextualComboDisplayValue;

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

    /**
     * 
     * @return
     *     The contextualComboDisplayValue
     */
    public String getContextualComboDisplayValue() {
        return contextualComboDisplayValue;
    }

    /**
     * 
     * @param contextualComboDisplayValue
     *     The contextualComboDisplayValue
     */
    public void setContextualComboDisplayValue(String contextualComboDisplayValue) {
        this.contextualComboDisplayValue = contextualComboDisplayValue;
    }

}
