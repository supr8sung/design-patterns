package com.xebia.fs101.designpatterns.creational.builder_pattern.components;

public class Engine {

    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {

        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        }
        else {
            System.out.println("Can't go(), need to start the engine first");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}