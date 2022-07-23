package guru.springframework.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfg.di.controllers.ConstructorInjectedController;
import guru.springframework.sfg.di.controllers.MyController;
import guru.springframework.sfg.di.controllers.PropertyInjectedController;
import guru.springframework.sfg.di.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController mc=(MyController) ctx.getBean("myController");
		String greeting=mc.sayHello();
		System.out.println(greeting);
		
		System.out.println("Property");
		PropertyInjectedController pic=(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(pic.getGreeting());
		
		System.out.println("Getter");
		SetterInjectedController sic=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(sic.getGreeting());
		
		System.out.println("Konstruktor");
		ConstructorInjectedController cic=(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(cic.getGreeting());
	}

}
