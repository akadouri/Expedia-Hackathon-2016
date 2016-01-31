
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightPrice {

    @SerializedName("BaseRate")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.BaseRate BaseRate;
    @SerializedName("TaxesAndFees")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.TaxesAndFees TaxesAndFees;
    @SerializedName("TotalRate")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.TotalRate TotalRate;

    /**
     * 
     * @return
     *     The BaseRate
     */
    public com.arielandchris.expediahackathon.model.pkgs.BaseRate getBaseRate() {
        return BaseRate;
    }

    /**
     * 
     * @param BaseRate
     *     The BaseRate
     */
    public void setBaseRate(com.arielandchris.expediahackathon.model.pkgs.BaseRate BaseRate) {
        this.BaseRate = BaseRate;
    }

    /**
     * 
     * @return
     *     The TaxesAndFees
     */
    public com.arielandchris.expediahackathon.model.pkgs.TaxesAndFees getTaxesAndFees() {
        return TaxesAndFees;
    }

    /**
     * 
     * @param TaxesAndFees
     *     The TaxesAndFees
     */
    public void setTaxesAndFees(com.arielandchris.expediahackathon.model.pkgs.TaxesAndFees TaxesAndFees) {
        this.TaxesAndFees = TaxesAndFees;
    }

    /**
     * 
     * @return
     *     The TotalRate
     */
    public com.arielandchris.expediahackathon.model.pkgs.TotalRate getTotalRate() {
        return TotalRate;
    }

    /**
     * 
     * @param TotalRate
     *     The TotalRate
     */
    public void setTotalRate(com.arielandchris.expediahackathon.model.pkgs.TotalRate TotalRate) {
        this.TotalRate = TotalRate;
    }

}
