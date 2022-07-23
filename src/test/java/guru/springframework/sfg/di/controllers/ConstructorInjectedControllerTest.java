package guru.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller=new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
