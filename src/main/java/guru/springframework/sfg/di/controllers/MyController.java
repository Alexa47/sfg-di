package guru.springframework.sfg.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHello() {
		System.out.println("Hello world!");
		return "Hi bitches";
	}
}
