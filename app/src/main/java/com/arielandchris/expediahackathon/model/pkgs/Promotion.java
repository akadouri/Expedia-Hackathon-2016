
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Promotion {

    @SerializedName("Amount")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.Amount Amount;
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 
     * @return
     *     The Amount
     */
    public com.arielandchris.expediahackathon.model.pkgs.Amount getAmount() {
        return Amount;
    }

    /**
     * 
     * @param Amount
     *     The Amount
     */
    public void setAmount(com.arielandchris.expediahackathon.model.pkgs.Amount Amount) {
        this.Amount = Amount;
    }

    /**
     * 
     * @return
     *     The Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * 
     * @param Description
     *     The Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
