package br.com.cs.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.cs.didemo.controller.without.spring.ConstructorInjectionController;
import br.com.cs.didemo.controller.without.spring.PropertyInjectionController;
import br.com.cs.didemo.controller.without.spring.SetterInjectionController;
import br.com.cs.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) applicationContext.getBean("myController");

		System.out.println(controller.hello());

		System.out.println(((PropertyInjectionController) applicationContext.getBean(PropertyInjectionController.class))
				.sayHello());

		System.out.println(
				((SetterInjectionController) applicationContext.getBean(SetterInjectionController.class)).sayHello());

		System.out.println(
				((ConstructorInjectionController) applicationContext.getBean(ConstructorInjectionController.class))
						.sayHello());

		// See that we did not create any instance of MyController, but since we
		// annotated it as @Components the Spring context manages
		// the creation of its instances

	}

}
