package com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe.multi_threaded;

import com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe.Singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoMultiThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> callable = () -> { return Singleton.getInstance("gym").value; };
        Callable<String> anotherCallble = () -> {return Singleton.getInstance("gold-gym").value;};
        Future<String> submit = executorService.submit(callable);
        Future<String> anotherSubmit = executorService.submit(anotherCallble);
        while (!submit.isDone() && !anotherSubmit.isDone()) {
            System.out.println(submit.get());
            System.out.println(anotherSubmit.get());
        }
    }
}
