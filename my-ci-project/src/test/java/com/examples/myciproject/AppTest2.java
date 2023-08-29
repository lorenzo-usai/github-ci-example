package com.examples.myciproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest2 {

	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void test() {
		assertEquals("Hallo", app.sayHello());
	}

}
