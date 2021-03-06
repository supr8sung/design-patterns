package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories;

import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.Button;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.MacOsButton;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.Checkbox;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.MacOsCheckBox;

public class MacOsFactory implements GUIFactory {

    public Button createButton() {

        return new MacOsButton();
    }

    public Checkbox createCheckbox() {

        return new MacOsCheckBox();
    }
}
