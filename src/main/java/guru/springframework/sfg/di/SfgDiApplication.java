package guru.springframework.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfg.di.controllers.ConstructorInjectedController;
import guru.springframework.sfg.di.controllers.I18nController;
import guru.springframework.sfg.di.controllers.MyController;
import guru.springframework.sfg.di.controllers.PetController;
import guru.springframework.sfg.di.controllers.PropertyInjectedController;
import guru.springframework.sfg.di.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController mc=(MyController) ctx.getBean("myController");
		System.out.println("Primary bean");
		System.out.println(mc.sayHello());
		
		System.out.println("Property");
		PropertyInjectedController pic=(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(pic.getGreeting());
		
		System.out.println("Getter");
		SetterInjectedController sic=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(sic.getGreeting());
		
		System.out.println("Konstruktor");
		ConstructorInjectedController cic=(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(cic.getGreeting());
		
		I18nController i18c=(I18nController)ctx.getBean("i18nController");
		System.out.println(i18c.sayHello());
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

	}

}
