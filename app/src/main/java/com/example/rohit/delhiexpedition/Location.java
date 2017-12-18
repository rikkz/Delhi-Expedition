package com.example.rohit.delhiexpedition;

/**
 * Created by Rohit on 19-12-2017.
 */

public class Location {
    private String locationName;
   // private String locationCordinates;
    private String locationDescription;
    private Integer locationImageResourceId;

    public Location(String locationName, String locationDescription, Integer locationImageResourceId) {
        this.locationName = locationName;
        this.locationDescription = locationDescription;
        this.locationImageResourceId = locationImageResourceId;
    }

    public String getLocationName() {
        return locationName;
    }

//    public String getLocationCordinates() {
//        return locationName;
//    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Integer getLocationImageResourceId() {
        return locationImageResourceId;
    }

    @Override
    public String toString() {
        return "{ location_name :"+ locationName +";" +
               // " location_coordinates:"+ locationCordinates +";" +
                " location_Description:"+ locationDescription+"; }";
    }
}

