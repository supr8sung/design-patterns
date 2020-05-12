package com.xebia.fs101.designpatterns.creational.singleton_pattern.non_thread_safe

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DemoSingleThreadTest {
    @Test
    void testName() {
        println "fe"
        Assertions.assertEquals("a", "b");
    }
}
