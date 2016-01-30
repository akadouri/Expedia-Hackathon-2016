package com.arielandchris.expediahackathon.model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ariel on 1/30/16.
 */
public class QuestionnaireResult implements Parcelable {

    boolean willDrive;
    boolean willFly;

    boolean needsToRentACar;

    boolean smallDrive;
    boolean mediumDrive;

    boolean smallFlight;
    boolean mediumFlight;

    public QuestionnaireResult() {

    }

    public QuestionnaireResult(boolean willDrive, boolean willFly, boolean needsToRentACar, boolean smallDrive, boolean mediumDrive, boolean smallFlight, boolean mediumFlight) {
        this.willDrive = willDrive;
        this.willFly = willFly;
        this.needsToRentACar = needsToRentACar;
        this.smallDrive = smallDrive;
        this.mediumDrive = mediumDrive;
        this.smallFlight = smallFlight;
        this.mediumFlight = mediumFlight;
    }

    public boolean isWillDrive() {
        return willDrive;
    }

    public void setWillDrive(boolean willDrive) {
        this.willDrive = willDrive;
    }

    public boolean isWillFly() {
        return willFly;
    }

    public void setWillFly(boolean willFly) {
        this.willFly = willFly;
    }

    public boolean isNeedsToRentACar() {
        return needsToRentACar;
    }

    public void setNeedsToRentACar(boolean needsToRentACar) {
        this.needsToRentACar = needsToRentACar;
    }

    public boolean isSmallDrive() {
        return smallDrive;
    }

    public void setSmallDrive(boolean smallDrive) {
        this.smallDrive = smallDrive;
    }

    public boolean isMediumDrive() {
        return mediumDrive;
    }

    public void setMediumDrive(boolean mediumDrive) {
        this.mediumDrive = mediumDrive;
    }

    public boolean isSmallFlight() {
        return smallFlight;
    }

    public void setSmallFlight(boolean smallFlight) {
        this.smallFlight = smallFlight;
    }

    public boolean isMediumFlight() {
        return mediumFlight;
    }

    public void setMediumFlight(boolean mediumFlight) {
        this.mediumFlight = mediumFlight;
    }

    protected QuestionnaireResult(Parcel in) {
        willDrive = in.readByte() != 0x00;
        willFly = in.readByte() != 0x00;
        needsToRentACar = in.readByte() != 0x00;
        smallDrive = in.readByte() != 0x00;
        mediumDrive = in.readByte() != 0x00;
        smallFlight = in.readByte() != 0x00;
        mediumFlight = in.readByte() != 0x00;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (willDrive ? 0x01 : 0x00));
        dest.writeByte((byte) (willFly ? 0x01 : 0x00));
        dest.writeByte((byte) (needsToRentACar ? 0x01 : 0x00));
        dest.writeByte((byte) (smallDrive ? 0x01 : 0x00));
        dest.writeByte((byte) (mediumDrive ? 0x01 : 0x00));
        dest.writeByte((byte) (smallFlight ? 0x01 : 0x00));
        dest.writeByte((byte) (mediumFlight ? 0x01 : 0x00));
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<QuestionnaireResult> CREATOR = new Parcelable.Creator<QuestionnaireResult>() {
        @Override
        public QuestionnaireResult createFromParcel(Parcel in) {
            return new QuestionnaireResult(in);
        }

        @Override
        public QuestionnaireResult[] newArray(int size) {
            return new QuestionnaireResult[size];
        }
    };
}