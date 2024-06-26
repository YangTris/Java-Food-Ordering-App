package com.example.food_ordering_app.models.map;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("jsonschema2pojo")
public class Route {

    @SerializedName("bounds")
    @Expose
    private Bounds bounds;
    @SerializedName("copyrights")
    @Expose
    private String copyrights;
    @SerializedName("legs")
    @Expose
    private List<Leg> legs;
    @SerializedName("overview_polyline")
    @Expose
    private OverviewPolyline overviewPolyline;
    @SerializedName("summary")
    private String summary;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings;
    @SerializedName("waypoint_order")
    @Expose
    private List<Object> waypointOrder;

    /**
     * No args constructor for use in serialization
     *
     */
    public Route() {
    }

    /**
     *
     * @param summary
     * @param overviewPolyline
     * @param copyrights
     * @param legs
     * @param warnings
     * @param bounds
     * @param waypointOrder
     */
    public Route(Bounds bounds, String copyrights, List<Leg> legs, OverviewPolyline overviewPolyline, String summary, List<Object> warnings, List<Object> waypointOrder) {
        super();
        this.bounds = bounds;
        this.copyrights = copyrights;
        this.legs = legs;
        this.overviewPolyline = overviewPolyline;
        this.summary = summary;
        this.warnings = warnings;
        this.waypointOrder = waypointOrder;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public OverviewPolyline getOverviewPolyline() {
        return overviewPolyline;
    }

    public void setOverviewPolyline(OverviewPolyline overviewPolyline) {
        this.overviewPolyline = overviewPolyline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public List<Object> getWaypointOrder() {
        return waypointOrder;
    }

    public void setWaypointOrder(List<Object> waypointOrder) {
        this.waypointOrder = waypointOrder;
    }

}