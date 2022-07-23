package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.GreetingService;

public class SetterInjectedController {

	private GreetingService gs;

	public GreetingService getGs() {
		return gs;
	}

	public void setGs(GreetingService gs) {
		this.gs = gs;
	}
	
	
}
