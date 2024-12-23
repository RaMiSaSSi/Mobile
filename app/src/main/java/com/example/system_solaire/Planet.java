package com.example.system_solaire;

import java.io.Serializable;

public class Planet implements Serializable {
    private String name;
    private int imageResId;
    private String distanceFromSun;
    private String mass;
    private String revolutionPeriod;
    private int satellites;

    public Planet(String name, int imageResId, String distanceFromSun, String mass, String revolutionPeriod, int satellites) {
        this.name = name;
        this.imageResId = imageResId;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.revolutionPeriod = revolutionPeriod;
        this.satellites = satellites;
    }

    public String getName() { return name; }
    public int getImageResId() { return imageResId; }
    public String getDistanceFromSun() { return distanceFromSun; }
    public String getMass() { return mass; }
    public String getRevolutionPeriod() { return revolutionPeriod; }
    public int getSatellites() { return satellites; }
}
