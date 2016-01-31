
package com.arielandchris.expediahackathon.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnrealDeals {

    @SerializedName("deals")
    @Expose
    private Deals deals;

    /**
     * 
     * @return
     *     The deals
     */
    public Deals getDeals() {
        return deals;
    }

    /**
     * 
     * @param deals
     *     The deals
     */
    public void setDeals(Deals deals) {
        this.deals = deals;
    }

}
