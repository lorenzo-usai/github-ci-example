package com.examples.myciproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void testSayHelloWithoutName() {
		assertEquals("Hello", app.sayHello());
	}
	
	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello World", app.sayHello("World"));
	}

}
