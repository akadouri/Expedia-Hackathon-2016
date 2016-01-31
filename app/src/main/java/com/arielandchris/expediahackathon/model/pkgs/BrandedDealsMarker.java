
package com.arielandchris.expediahackathon.model.pkgs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrandedDealsMarker {

    @SerializedName("BrandedDealsType")
    @Expose
    private List<String> BrandedDealsType = new ArrayList<String>();

    /**
     * 
     * @return
     *     The BrandedDealsType
     */
    public List<String> getBrandedDealsType() {
        return BrandedDealsType;
    }

    /**
     * 
     * @param BrandedDealsType
     *     The BrandedDealsType
     */
    public void setBrandedDealsType(List<String> BrandedDealsType) {
        this.BrandedDealsType = BrandedDealsType;
    }

}
