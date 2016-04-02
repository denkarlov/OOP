package com.practical;

public class Cat extends Animals implements VoiceAnimals{

	
	public Cat (String name){
		super(name);
	}
	
	String name = getName();
	public boolean voice(){
		if(name == "Cat"){
			System.out.println("Мау " + getName());
			return true;
		}
	
			else{
				System.out.println("Only cats can as Мау");
				return false;
			}
			
		}
	}