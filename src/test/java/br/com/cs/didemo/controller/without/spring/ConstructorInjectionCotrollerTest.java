package br.com.cs.didemo.controller.without.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import br.com.cs.didemo.services.GreetingServiceImp;

@Controller
public class ConstructorInjectionCotrollerTest {

	private ConstructorInjectionController constructorInjectionController;

	@BeforeEach
	public void setUp() throws Exception {
		// Manually injecting the filed the through constructor so null pointer is impossible situation!! 
		
		// THIS WAY WE CANNNOT EVEVN CREATE THAT CLASS WITHOT PROVIDING THE DEPENDENT OBJECT THAT BECAUSE IT RE PREFERRED WAY
		this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImp());

	}

	@Test
	public void testGreting() throws Exception {
		assertEquals(GreetingServiceImp.HELLO_MSG, constructorInjectionController.sayHello());
	}

}
