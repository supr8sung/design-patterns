package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons;

public class MacOsButton implements Button {

    @Override
    public void paint() {

        System.out.println("You have created a mac os button");
    }
}
