package com.xebia.fs101.designpatterns.creational.builder_pattern.builders;

import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Type;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Engine;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.GPSNavigator;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.Transmission;
import com.xebia.fs101.designpatterns.creational.builder_pattern.components.TripComputer;

public interface Builder {

    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
