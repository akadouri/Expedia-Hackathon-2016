package com.arielandchris.expediahackathon.model;

import com.arielandchris.expediahackathon.model.t2d.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 1/31/2016.
 */
public class Trip {
    private Airport origin, dest;
    private List<Package> packageList;
    private List<Activity> activityList;
    public Trip() {
        origin = null;
        dest = null;
        packageList = new ArrayList<>();
        activityList = new ArrayList<>();
    }

    public Trip(Trip other) {
        this.origin = other.origin;
        this.dest = other.dest;
    }

    public void setOriginAP(Airport airport) {
        this.origin = airport;
    }
    public void setDestAP(Airport airport) {
        this.dest = airport;
    }
    public Airport getOriginAP() { return this.origin; }
    public Airport getDestAP() { return this.dest; }

    public void addPackage(Package pkg) {
        packageList.add(pkg);
    }
    public List<Package> getPackageList() { return this.packageList; }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }
    public List<Activity> getActivityList() { return this.activityList; }
    


}
