package com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe.single_threaded;

import com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe.Singleton;

public class DemoSingleThread {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance("gym");
        Singleton anotherSingleton = Singleton.getInstance("gold gym");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }

}
