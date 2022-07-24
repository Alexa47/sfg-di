package guru.springframework.sfg.di.services;

import guru.springframework.sfg.di.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService{
	
	private final EnglishGreetingRepository englishGreetingRepository;
	
	
	
	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		super();
		this.englishGreetingRepository = englishGreetingRepository;
	}



	@Override
	public String sayGreeting() {
		return "Hello-english";
	}
}
