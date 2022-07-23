package guru.springframework.sfg.di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfg.di.services.PetService;

@Controller
public class PetController {

    private final PetService petService;
   

    public PetController(PetService petService) {
		super();
		this.petService = petService;
	}



	public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}