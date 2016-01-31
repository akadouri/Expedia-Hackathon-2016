
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomAmenityList {

    @SerializedName("RoomAmenity")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.RoomAmenity RoomAmenity;

    /**
     * 
     * @return
     *     The RoomAmenity
     */
    public com.arielandchris.expediahackathon.model.pkgs.RoomAmenity getRoomAmenity() {
        return RoomAmenity;
    }

    /**
     * 
     * @param RoomAmenity
     *     The RoomAmenity
     */
    public void setRoomAmenity(com.arielandchris.expediahackathon.model.pkgs.RoomAmenity RoomAmenity) {
        this.RoomAmenity = RoomAmenity;
    }

}
