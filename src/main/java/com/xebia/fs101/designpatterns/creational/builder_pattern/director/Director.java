package com.xebia.fs101.designpatterns.creational.builder_pattern.director;

import com.xebia.fs101.designpatterns.creational.builder_pattern.builders.Builder;
import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Type;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Engine;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.GPSNavigator;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Transmission;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
