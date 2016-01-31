
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amount {

    @SerializedName("Value")
    @Expose
    private String Value;
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * 
     * @return
     *     The Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * 
     * @param Value
     *     The Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 
     * @return
     *     The Currency
     */
    public String getCurrency() {
        return Currency;
    }

    /**
     * 
     * @param Currency
     *     The Currency
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

}
