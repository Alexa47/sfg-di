package guru.springframework.sfg.di.services;

public class GreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello";
	}

}
