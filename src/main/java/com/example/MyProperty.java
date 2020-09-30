package com.example;

import java.util.HashMap;
import java.util.Map;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;
import javax.inject.Inject;

@EachProperty("example")
public class MyProperty {
	private String id;
	private Map<String, NestedProperty> authentication;

	@Inject
	public MyProperty(@Parameter String id) {
		this.id = id;
	}

	public void setAuthentication(Map<String, NestedProperty> authentication) {
		this.authentication = authentication;
	}

	public ThirdLevelProperty getNestedPropertyAlreadyCasted() {
		return (ThirdLevelProperty) authentication.get("l2");
	}
}
