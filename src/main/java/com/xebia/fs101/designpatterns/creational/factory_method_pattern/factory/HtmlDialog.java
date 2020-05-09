package com.xebia.fs101.designpatterns.creational.factory_method_pattern.factory;

import com.xebia.fs101.designpatterns.creational.factory_method_pattern.button.Button;
import com.xebia.fs101.designpatterns.creational.factory_method_pattern.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {

        return new HtmlButton();
    }
}
