
package com.arielandchris.expediahackathon.model.pkgs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotel {

    @SerializedName("HotelIndex")
    @Expose
    private String HotelIndex;
    @SerializedName("HotelID")
    @Expose
    private String HotelID;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Location")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.Location Location;
    @SerializedName("Description")
    @Expose
    private String Description;
    @SerializedName("StarRating")
    @Expose
    private String StarRating;
    @SerializedName("TravelerReviewRating")
    @Expose
    private String TravelerReviewRating;
    @SerializedName("TravelerReviewCount")
    @Expose
    private String TravelerReviewCount;
    @SerializedName("OverviewThumbnail")
    @Expose
    private String OverviewThumbnail;
    @SerializedName("RoomRatePlanDescription")
    @Expose
    private String RoomRatePlanDescription;
    @SerializedName("RoomAmenityList")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.RoomAmenityList RoomAmenityList;
    @SerializedName("HotelPrice")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.HotelPrice HotelPrice;
    @SerializedName("RoomsRemaining")
    @Expose
    private String RoomsRemaining;
    @SerializedName("Promotion")
    @Expose
    private com.arielandchris.expediahackathon.model.pkgs.Promotion Promotion;

    /**
     * 
     * @return
     *     The HotelIndex
     */
    public String getHotelIndex() {
        return HotelIndex;
    }

    /**
     * 
     * @param HotelIndex
     *     The HotelIndex
     */
    public void setHotelIndex(String HotelIndex) {
        this.HotelIndex = HotelIndex;
    }

    /**
     * 
     * @return
     *     The HotelID
     */
    public String getHotelID() {
        return HotelID;
    }

    /**
     * 
     * @param HotelID
     *     The HotelID
     */
    public void setHotelID(String HotelID) {
        this.HotelID = HotelID;
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

    /**
     * 
     * @return
     *     The Location
     */
    public com.arielandchris.expediahackathon.model.pkgs.Location getLocation() {
        return Location;
    }

    /**
     * 
     * @param Location
     *     The Location
     */
    public void setLocation(com.arielandchris.expediahackathon.model.pkgs.Location Location) {
        this.Location = Location;
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

    /**
     * 
     * @return
     *     The StarRating
     */
    public String getStarRating() {
        return StarRating;
    }

    /**
     * 
     * @param StarRating
     *     The StarRating
     */
    public void setStarRating(String StarRating) {
        this.StarRating = StarRating;
    }

    /**
     * 
     * @return
     *     The TravelerReviewRating
     */
    public String getTravelerReviewRating() {
        return TravelerReviewRating;
    }

    /**
     * 
     * @param TravelerReviewRating
     *     The TravelerReviewRating
     */
    public void setTravelerReviewRating(String TravelerReviewRating) {
        this.TravelerReviewRating = TravelerReviewRating;
    }

    /**
     * 
     * @return
     *     The TravelerReviewCount
     */
    public String getTravelerReviewCount() {
        return TravelerReviewCount;
    }

    /**
     * 
     * @param TravelerReviewCount
     *     The TravelerReviewCount
     */
    public void setTravelerReviewCount(String TravelerReviewCount) {
        this.TravelerReviewCount = TravelerReviewCount;
    }

    /**
     * 
     * @return
     *     The OverviewThumbnail
     */
    public String getOverviewThumbnail() {
        return OverviewThumbnail;
    }

    /**
     * 
     * @param OverviewThumbnail
     *     The OverviewThumbnail
     */
    public void setOverviewThumbnail(String OverviewThumbnail) {
        this.OverviewThumbnail = OverviewThumbnail;
    }

    /**
     * 
     * @return
     *     The RoomRatePlanDescription
     */
    public String getRoomRatePlanDescription() {
        return RoomRatePlanDescription;
    }

    /**
     * 
     * @param RoomRatePlanDescription
     *     The RoomRatePlanDescription
     */
    public void setRoomRatePlanDescription(String RoomRatePlanDescription) {
        this.RoomRatePlanDescription = RoomRatePlanDescription;
    }

    /**
     * 
     * @return
     *     The RoomAmenityList
     */
    public com.arielandchris.expediahackathon.model.pkgs.RoomAmenityList getRoomAmenityList() {
        return RoomAmenityList;
    }

    /**
     * 
     * @param RoomAmenityList
     *     The RoomAmenityList
     */
    public void setRoomAmenityList(com.arielandchris.expediahackathon.model.pkgs.RoomAmenityList RoomAmenityList) {
        this.RoomAmenityList = RoomAmenityList;
    }

    /**
     * 
     * @return
     *     The HotelPrice
     */
    public com.arielandchris.expediahackathon.model.pkgs.HotelPrice getHotelPrice() {
        return HotelPrice;
    }

    /**
     * 
     * @param HotelPrice
     *     The HotelPrice
     */
    public void setHotelPrice(com.arielandchris.expediahackathon.model.pkgs.HotelPrice HotelPrice) {
        this.HotelPrice = HotelPrice;
    }

    /**
     * 
     * @return
     *     The RoomsRemaining
     */
    public String getRoomsRemaining() {
        return RoomsRemaining;
    }

    /**
     * 
     * @param RoomsRemaining
     *     The RoomsRemaining
     */
    public void setRoomsRemaining(String RoomsRemaining) {
        this.RoomsRemaining = RoomsRemaining;
    }

    /**
     * 
     * @return
     *     The Promotion
     */
    public com.arielandchris.expediahackathon.model.pkgs.Promotion getPromotion() {
        return Promotion;
    }

    /**
     * 
     * @param Promotion
     *     The Promotion
     */
    public void setPromotion(com.arielandchris.expediahackathon.model.pkgs.Promotion Promotion) {
        this.Promotion = Promotion;
    }

}
