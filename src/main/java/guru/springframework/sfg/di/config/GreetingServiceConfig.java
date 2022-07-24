package guru.springframework.sfg.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfg.di.repositories.EnglishGreetingRepository;
import guru.springframework.sfg.di.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfg.di.services.ConstructorInjectedGreetingService;
import guru.springframework.sfg.di.services.I18nEnglishGreetingService;
import guru.springframework.sfg.di.services.I18nSpanishService;
import guru.springframework.sfg.di.services.PetService;
import guru.springframework.sfg.di.services.PetServiceFactory;
import guru.springframework.sfg.di.services.PrimaryGreetingService;
import guru.springframework.sfg.di.services.PropertyInjectedGreetingService;
import guru.springframework.sfg.di.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile("dog")
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory().getPetService("cat");
	}
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl() ;
	}
		
	@Bean
	ConstructorInjectedGreetingService constructorInjectedGreetingService() {
		return new ConstructorInjectedGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	@Profile("EN")
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository egr) {
		return new I18nEnglishGreetingService(egr);
	}
	
	@Bean("i18nService")
	@Profile("ES")
	I18nSpanishService i18nSpanishService() {
		return new I18nSpanishService();
	}
}
