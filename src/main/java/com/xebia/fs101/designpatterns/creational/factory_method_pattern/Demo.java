package com.xebia.fs101.designpatterns.creational.factory_method_pattern;

import com.xebia.fs101.designpatterns.creational.factory_method_pattern.factory.Dialog;
import com.xebia.fs101.designpatterns.creational.factory_method_pattern.factory.HtmlDialog;
import com.xebia.fs101.designpatterns.creational.factory_method_pattern.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {

        configure();
        runBusinessLogic();
    }

    private static void configure() {


        if (System.getProperty("os.name").equals("Mac OS X"))
            dialog = new WindowsDialog();
        else
            dialog = new HtmlDialog();
    }

    private static void runBusinessLogic() {

        dialog.renderWindow();
    }
}
