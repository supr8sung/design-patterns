package com.xebia.fs101.designpatterns.creational.builder_pattern.components;

import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel Level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        }
        else
            System.out.println("Car isn't started");
    }
}
