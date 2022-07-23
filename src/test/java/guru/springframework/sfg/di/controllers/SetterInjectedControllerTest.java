package guru.springframework.sfg.di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.GreetingService;
import guru.springframework.sfg.di.services.SetterInjectedGreetingService;
import guru.springframework.sfg.di.services.ConstructorInjectedGreetingService;

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
