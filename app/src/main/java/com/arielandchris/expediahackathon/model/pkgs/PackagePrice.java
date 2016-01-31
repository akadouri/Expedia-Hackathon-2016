
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackagePrice {

    @SerializedName("TotalPrice")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.TotalPrice TotalPrice;
    @SerializedName("TotalSavings")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.TotalSavings TotalSavings;

    /**
     * 
     * @return
     *     The TotalPrice
     */
    public com.arielandchris.expediahackathon.model.pkgs.TotalPrice getTotalPrice() {
        return TotalPrice;
    }

    /**
     * 
     * @param TotalPrice
     *     The TotalPrice
     */
    public void setTotalPrice(com.arielandchris.expediahackathon.model.pkgs.TotalPrice TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * 
     * @return
     *     The TotalSavings
     */
    public com.arielandchris.expediahackathon.model.pkgs.TotalSavings getTotalSavings() {
        return TotalSavings;
    }

    /**
     * 
     * @param TotalSavings
     *     The TotalSavings
     */
    public void setTotalSavings(com.arielandchris.expediahackathon.model.pkgs.TotalSavings TotalSavings) {
        this.TotalSavings = TotalSavings;
    }

}
