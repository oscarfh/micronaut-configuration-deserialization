package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type",
		visible = true
)
@JsonSubTypes({@JsonSubTypes.Type(
		value = ThirdLevelProperty.class,
		name = "LastLevel"
)})
@JsonIgnoreProperties(ignoreUnknown = true)
public class NestedProperty {
	private String type;

	public NestedProperty() {
	}

	public NestedProperty(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
