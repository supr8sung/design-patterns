package com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe;

public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {

        //this is done on purpose for initialization delay, this will help us testing in
        // multithreaded environment
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null)
            instance = new Singleton(value);
        return instance;
    }
}
