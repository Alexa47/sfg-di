package guru.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller=new ConstructorInjectedController(new ConstructorInjectedGreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
