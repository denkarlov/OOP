package com.practical;

public class Dog extends Animals implements VoiceAnimals{
	
	public Dog (String name){
		super(name);
	}
	
	String name = getName();
	
	public boolean voice(){
		if(name == "Dog"){
			System.out.println("Gav " + getName());
			return true;
		}
	
			else{
				System.out.println("Only dogs can as Gav");
				return false;
			}
			
		}
	}
	


