package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
public class DemoTest {

    @Inject
    EmbeddedApplication application;

	@Inject
	MyBean myBean;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
        myBean.getNestedPropertyAlreadyCasted().getProperties().keySet().stream().forEach(s -> System.out.println(s));
    }

}
