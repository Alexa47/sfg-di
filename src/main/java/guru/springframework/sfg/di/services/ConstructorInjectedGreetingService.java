package guru.springframework.sfg.di.services;

public class ConstructorInjectedGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello- Constructor";
	}

}
