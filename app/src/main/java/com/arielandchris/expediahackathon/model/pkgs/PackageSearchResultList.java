
package com.arielandchris.expediahackathon.model.pkgs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackageSearchResultList {

    @SerializedName("PackageSearchResult")
    @Expose
    private List<com.arielandchris.expediahackathon.model.pkgs.PackageSearchResult> PackageSearchResult = new ArrayList<com.arielandchris.expediahackathon.model.pkgs.PackageSearchResult>();

    /**
     * 
     * @return
     *     The PackageSearchResult
     */
    public List<com.arielandchris.expediahackathon.model.pkgs.PackageSearchResult> getPackageSearchResult() {
        return PackageSearchResult;
    }

    /**
     * 
     * @param PackageSearchResult
     *     The PackageSearchResult
     */
    public void setPackageSearchResult(List<com.arielandchris.expediahackathon.model.pkgs.PackageSearchResult> PackageSearchResult) {
        this.PackageSearchResult = PackageSearchResult;
    }

}
