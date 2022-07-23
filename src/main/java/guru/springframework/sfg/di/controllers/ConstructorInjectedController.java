package guru.springframework.sfg.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfg.di.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
