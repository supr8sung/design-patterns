package com.xebia.fs101.designpatterns.creational.factory_method_pattern.button;

public class HtmlButton implements Button {

    public void render() {

        System.out.println("<button>Test</button>");
        onClick();
    }

    public void onClick() {

        System.out.println("Click! Button says - 'Hello World!'");

    }
}
