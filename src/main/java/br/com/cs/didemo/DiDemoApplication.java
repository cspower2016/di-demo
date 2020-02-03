package br.com.cs.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import br.com.cs.didemo.controller.without.spring.ConstructorInjectionController;
import br.com.cs.didemo.controller.without.spring.PropertyInjectionController;
import br.com.cs.didemo.controller.without.spring.SetterInjectionController;
import br.com.cs.didemo.examplesbeans.FakeDataSource;
import br.com.cs.didemo.examplesbeans.JmsDataSource;
import br.com.cs.spring.MyController;

@SpringBootApplication // spring is going to scan everything under this path
@ComponentScan(basePackages = { "br.com.cs" }) // It is going to override the above behavior
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

		System.out.println(((FakeDataSource) applicationContext.getBean(FakeDataSource.class)));
		System.out.println(((JmsDataSource) applicationContext.getBean(JmsDataSource.class)));

		// See that we did not create any instance of MyController, but since we
		// annotated it as @Components the Spring context manages
		// the creation of its instances

	}

}
