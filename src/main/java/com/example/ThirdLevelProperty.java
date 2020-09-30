package com.example;

import java.util.HashMap;
import java.util.Map;

public class ThirdLevelProperty extends NestedProperty {
	private String id;
	private Map<String, String> properties;

	public ThirdLevelProperty() {
		super();
		properties = new HashMap<>();
	}

	public ThirdLevelProperty(String id, Map<String, String> properties) {
		super();
		this.id = id;
		this.properties = properties;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
}
