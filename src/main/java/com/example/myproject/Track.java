package com.example.myproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    private String Name;
    private Double Latitude;
    private Double Longitude;

    protected Track() {}

    public Track(String Name, Double Latitude, Double Longitude) {
        this.Name = Name;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
    }

    @Override
    public String toString() {
        return String.format(
                "Track[id=%d, name='%s', lat=%f, lon=%f]",
                ID, Name, Latitude, Longitude);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

}
