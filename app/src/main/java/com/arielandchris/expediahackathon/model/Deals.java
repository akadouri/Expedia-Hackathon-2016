
package com.arielandchris.expediahackathon.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deals {

    @SerializedName("packages")
    @Expose
    private List<Package> packages = new ArrayList<Package>();

    /**
     * 
     * @return
     *     The packages
     */
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * 
     * @param packages
     *     The packages
     */
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

}
