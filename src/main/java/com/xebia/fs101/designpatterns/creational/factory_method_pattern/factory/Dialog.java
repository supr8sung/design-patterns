package com.xebia.fs101.designpatterns.creational.factory_method_pattern.factory;

import com.xebia.fs101.designpatterns.creational.factory_method_pattern.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton=createButton();
        okButton.render();

    }

    public abstract Button createButton();
}

