package com.fds.springboot.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity(name="locations")
@Access(AccessType.FIELD)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long location_id;
    private double latitude;
    private double longitude;
    private Timestamp location_date;

    @ManyToMany(mappedBy = "locations")
    @JsonIgnore
    private List<User> users;

    // GETTERS AND SETTERS
    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Timestamp getLocation_date() {
        return location_date;
    }

    public void setLocation_date(Timestamp location_date) {
        this.location_date = location_date;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
