
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomAmenity {

    @SerializedName("ID")
    @Expose
    private String ID;
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * 
     * @return
     *     The ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

}
