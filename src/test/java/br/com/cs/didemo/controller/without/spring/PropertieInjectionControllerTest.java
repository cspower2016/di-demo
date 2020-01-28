package br.com.cs.didemo.controller.without.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cs.didemo.controller.without.spring.PropertyInjectionController;
import br.com.cs.didemo.services.GreetingServiceImp;

public class PropertieInjectionControllerTest {

	private PropertyInjectionController propertyInjectionController;

	@BeforeEach
	public void setUp() throws Exception {
		this.propertyInjectionController = new PropertyInjectionController();

		// Manually injecting the property otherwise We're going to have a
		// NullPointerException performing the test
		this.propertyInjectionController.greetingServiceImp = new GreetingServiceImp();
	}

	@Test
	public void testGreting() throws Exception {
		assertEquals(GreetingServiceImp.HELLO_MSG, propertyInjectionController.sayHello());
	}

}
