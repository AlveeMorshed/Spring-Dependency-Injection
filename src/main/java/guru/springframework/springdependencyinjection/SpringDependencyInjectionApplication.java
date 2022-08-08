package guru.springframework.springdependencyinjection;

import guru.springframework.springdependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.springdependencyinjection.controllers.MyController;
import guru.springframework.springdependencyinjection.controllers.PropertyInjectedController;
import guru.springframework.springdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		//The following getBean method returns the Controller object since
		// 		the MyController class is annotated with @Controller to be treated as Bean or Spring Component
		//         So Spring is creating the controller object FOR US. We did not create it using "new MyController()"
		MyController myController = (MyController) context.getBean("myController"); // Casting required since return type is of "Object" type.

		System.out.println("--------PRIMARY-------------");
		System.out.println(myController.sayHello());

		System.out.println("---------Property------------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----------Setter-----------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------Constructor--------");

		ConstructorInjectedController constructorInjController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjController.getGreeting());

	}

}
