package com.testAutomationCentral.in;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Animal>animals = new ArrayList<>();
		 animals.add(new Animal("dog", true, true));
		 
		 animals.add(new Animal("rabbit", true, false ));
		 
	animals.add(new Animal("fish",true, true));
	
	
	
		print(animals, new CheckCanJump());
		

	}
	
	
	public static void print(List<Animal> animals, checkAnimal filter) {
		
		
		for(Animal animal: animals) {
			
			if(filter.check(animal)) {
				
				System.out.println(animal.type());
				
			}
			
		}
		
	}

}
