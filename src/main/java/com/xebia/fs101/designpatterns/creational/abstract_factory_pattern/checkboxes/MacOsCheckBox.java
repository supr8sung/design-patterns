package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes;

public class MacOsCheckBox implements Checkbox {

    @Override
    public void paint() {

        System.out.println("You have created a macos checkbox");
    }
}
