package guru.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller=new PropertyInjectedController();
		controller.gs=new GreetingServiceImpl();
	}
	
	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
