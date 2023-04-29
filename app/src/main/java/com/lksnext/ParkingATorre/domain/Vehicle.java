package com.lksnext.ParkingATorre.domain;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String license;
    private VehicleType type; //Mas tarde lo cambiare a vehicleType
    private List<Spot> spots;

    public Vehicle(String license, VehicleType type) {
        this.license = license;
        this.type = type;
        this.spots = new ArrayList<>();
    }

    public enum VehicleType {
        CAR,
        TRUCK,
        MOTORCYCLE,
        HANDICAPPED,
        ELECTRIC
    }
}

