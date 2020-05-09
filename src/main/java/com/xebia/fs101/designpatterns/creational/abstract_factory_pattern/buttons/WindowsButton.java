package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {

        System.out.println("You have create a windows button");
    }
}
