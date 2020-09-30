package com.example;
import javax.inject.Singleton;

@Singleton
public class MyBean {
	private MyProperty myProperty;

	public MyBean(MyProperty myProperty) {
		this.myProperty = myProperty;
	}

	public ThirdLevelProperty getNestedPropertyAlreadyCasted() {
		return myProperty.getNestedPropertyAlreadyCasted();
	}
}
