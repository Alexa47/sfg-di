package guru.springframework.sfg.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGreetingService implements GreetingService{
	
	@Override
	public String sayGreeting() {
		return "Hello world from primary bean";
	}

}
