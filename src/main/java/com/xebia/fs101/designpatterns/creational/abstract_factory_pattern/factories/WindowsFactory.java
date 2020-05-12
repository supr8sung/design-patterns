package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories;

import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.Button;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.WindowsButton;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.Checkbox;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    public Button createButton() {

        return new WindowsButton();
    }

    public Checkbox createCheckbox() {

        return new WindowsCheckbox();
    }
}
