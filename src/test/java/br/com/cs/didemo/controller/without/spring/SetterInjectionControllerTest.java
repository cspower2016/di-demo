package br.com.cs.didemo.controller.without.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.cs.didemo.controller.without.spring.SetterInjectionController;
import br.com.cs.didemo.services.GreetingServiceImp;

public class SetterInjectionControllerTest {

	private SetterInjectionController setterInjectionController;

	@BeforeEach
	public void setUp() throws Exception {
		this.setterInjectionController = new SetterInjectionController();

		// Manually injecting the filed through the setter method otherwise We're going to have
		// a NullPointerException performing the test
		this.setterInjectionController.setGreetingServiceImp(new GreetingServiceImp());
	}

	@Test
	public void testGreting() throws Exception {
		assertEquals(GreetingServiceImp.HELLO_MSG, setterInjectionController.sayHello());
	}

}
