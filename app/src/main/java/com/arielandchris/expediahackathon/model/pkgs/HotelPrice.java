
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelPrice {

    @SerializedName("BaseRate")
    @Expose
    private BaseRate_ BaseRate;
    @SerializedName("TaxRcAndFees")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.TaxRcAndFees TaxRcAndFees;
    @SerializedName("TotalRate")
    @Expose
    private TotalRate_ TotalRate;

    /**
     * 
     * @return
     *     The BaseRate
     */
    public BaseRate_ getBaseRate() {
        return BaseRate;
    }

    /**
     * 
     * @param BaseRate
     *     The BaseRate
     */
    public void setBaseRate(BaseRate_ BaseRate) {
        this.BaseRate = BaseRate;
    }

    /**
     * 
     * @return
     *     The TaxRcAndFees
     */
    public com.arielandchris.expediahackathon.model.pkgs.TaxRcAndFees getTaxRcAndFees() {
        return TaxRcAndFees;
    }

    /**
     * 
     * @param TaxRcAndFees
     *     The TaxRcAndFees
     */
    public void setTaxRcAndFees(com.arielandchris.expediahackathon.model.pkgs.TaxRcAndFees TaxRcAndFees) {
        this.TaxRcAndFees = TaxRcAndFees;
    }

    /**
     * 
     * @return
     *     The TotalRate
     */
    public TotalRate_ getTotalRate() {
        return TotalRate;
    }

    /**
     * 
     * @param TotalRate
     *     The TotalRate
     */
    public void setTotalRate(TotalRate_ TotalRate) {
        this.TotalRate = TotalRate;
    }

}
