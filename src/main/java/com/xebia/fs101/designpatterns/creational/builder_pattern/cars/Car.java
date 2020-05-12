package com.xebia.fs101.designpatterns.creational.builder_pattern.cars;

import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Engine;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.GPSNavigator;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Transmission;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.TripComputer;

public class Car {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }
}
