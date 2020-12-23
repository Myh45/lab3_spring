package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double lat;
    private double lon;
    private String result;

    public Model(double lat, double lon, String result) {
        this.lat = lat;
        this.lon = lon;
        this.result = result;
    }

    public Model() {

    }

    public Long getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getResult() {
        return result;
    }
}