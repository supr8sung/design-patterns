package com.xebia.fs101.designpatterns.creational.abstract_factory_pattern;

import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.app.Application;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories.GUIFactory;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories.MacOsFactory;
import com.xebia.fs101.designpatterns.creational.abstract_factory_pattern.factories.WindowsFactory;

public class Demo {

    public static void main(String[] args) {

        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {

        GUIFactory factory;
        Application app;
        if (System.getProperty("os.name").contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        }
        else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
}
