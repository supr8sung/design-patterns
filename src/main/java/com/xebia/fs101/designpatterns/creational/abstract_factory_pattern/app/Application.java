package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.app;

import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.Button;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.Checkbox;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {

        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
