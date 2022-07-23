package guru.springframework.sfg.di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfg.di.services.GreetingService;
import guru.springframework.sfg.di.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController c;
	@BeforeEach
	void setUp() throws Exception {
		c= new SetterInjectedController();
		c.setGs(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(c.getGs().sayGreeting());
	}

}
