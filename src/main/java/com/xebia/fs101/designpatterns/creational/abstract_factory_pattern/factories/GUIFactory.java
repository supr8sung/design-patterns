package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories;

import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.buttons.Button;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
