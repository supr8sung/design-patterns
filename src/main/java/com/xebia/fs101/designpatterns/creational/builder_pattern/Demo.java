package com.xebia.fs101.designpatterns.creational.builder_pattern;

import com.xebia.fs101.designpatterns.creational.builder_pattern.builders.CarBuilder;
import com.xebia.fs101.designpatterns.creational.builder_pattern.builders.CarManualBuilder;
import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Car;
import com.xebia.fs101.designpatterns.creational.builder_pattern.cars.Manual;
import com.xebia.fs101.designpatterns.creational.builder_pattern.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("car built: " + car.getType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n Car manual built:\n" + carManual.print());
    }
}
