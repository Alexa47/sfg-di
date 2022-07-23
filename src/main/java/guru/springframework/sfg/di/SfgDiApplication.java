package guru.springframework.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfg.di.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController mc=(MyController) ctx.getBean("myController");
		String greeting=mc.sayHello();
		System.out.println(greeting);
	}

}
