package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService gs;
	
	public String getGreeting() {
		return gs.sayGreeting();
	}
}
