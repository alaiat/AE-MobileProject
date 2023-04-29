package com.lksnext.ParkingATorre.domain;



public abstract class Spot {
    private int id;
    private SpotType type;
    private boolean available;
    private ReservationManager reservationManager;

    public Spot(int id, SpotType type) {
        this.id = id;
        this.type = type;
        this.available = true;
        this.reservationManager = new ReservationManager();
    }



    public enum SpotType {
        CAR,
        TRUCK,
        MOTORCYCLE,
        HANDICAPPED,
        ELECTRIC
    }
}
