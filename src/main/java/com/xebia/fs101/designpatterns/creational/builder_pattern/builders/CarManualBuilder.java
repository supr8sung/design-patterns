package com.xebia.fs101.designpatterns.creational.builder_pattern.builders;

import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Manual;
import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Type;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Engine;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.GPSNavigator;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Transmission;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.TripComputer;

public class CarManualBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
