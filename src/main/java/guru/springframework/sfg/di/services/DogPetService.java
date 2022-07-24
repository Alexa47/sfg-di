package guru.springframework.sfg.di.services;

public class DogPetService implements PetService{
	@Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}