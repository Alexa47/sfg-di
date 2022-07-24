package guru.springframework.sfg.di.services;


public class PrimaryGreetingService implements GreetingService{
	
	@Override
	public String sayGreeting() {
		return "Hello world from primary bean";
	}

}
