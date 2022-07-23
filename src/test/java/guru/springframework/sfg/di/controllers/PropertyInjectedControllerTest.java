package guru.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.ConstructorInjectedGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller=new PropertyInjectedController();
		controller.greetingService=new ConstructorInjectedGreetingService();
	}
	
	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
