
package com.arielandchris;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Source {

    @SerializedName("srcId")
    @Expose
    private String srcId;
    @SerializedName("systemId")
    @Expose
    private Integer systemId;

    /**
     * 
     * @return
     *     The srcId
     */
    public String getSrcId() {
        return srcId;
    }

    /**
     * 
     * @param srcId
     *     The srcId
     */
    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    /**
     * 
     * @return
     *     The systemId
     */
    public Integer getSystemId() {
        return systemId;
    }

    /**
     * 
     * @param systemId
     *     The systemId
     */
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

}
