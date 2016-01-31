
package com.arielandchris.expediahackathon.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnrealDeals {

    @SerializedName("errors")
    @Expose
    private Errors errors;
    @SerializedName("packageDeal")
    @Expose
    private List<Package> packageDeal = new ArrayList<Package>();

    /**
     * 
     * @return
     *     The errors
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * 
     * @param errors
     *     The errors
     */
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    /**
     * 
     * @return
     *     The packageDeal
     */
    public List<Package> getPackageDeal() {
        return packageDeal;
    }

    /**
     * 
     * @param packageDeal
     *     The packageDeal
     */
    public void setPackageDeal(List<Package> packageDeal) {
        this.packageDeal = packageDeal;
    }

}
