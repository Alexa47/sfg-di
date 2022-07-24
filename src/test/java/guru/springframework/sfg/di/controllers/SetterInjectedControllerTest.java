package guru.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.SetterInjectedGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController c;
	@BeforeEach
	void setUp() throws Exception {
		c= new SetterInjectedController();
		c.setGreetingService(new SetterInjectedGreetingService());
	}

	@Test
	void test() {
		System.out.println(c.getGreeting());
	}

}
