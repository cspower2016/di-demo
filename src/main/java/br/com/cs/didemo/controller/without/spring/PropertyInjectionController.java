package br.com.cs.didemo.controller.without.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.cs.didemo.services.GreetingService;

@Controller
public class PropertyInjectionController {

	@Autowired
	@Qualifier("greetingServiceImp")
	public GreetingService greetingServiceImp;// the field name can also defined what implementation is going to be used
												// here so no qualifier is necessary, but uses @Qulaifier makes the code clear
	
	// In fact witFh a default implementation annotated as @Primary the name convention does work son then you are required to define a Qualifier 

	public String sayHello() {
		return greetingServiceImp.sayGreeting();
	}

}
