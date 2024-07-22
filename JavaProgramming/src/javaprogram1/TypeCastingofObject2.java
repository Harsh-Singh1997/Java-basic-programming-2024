package javaprogram1;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingofObject2 {

	public static void main(String[] args) {
		
		//Rule 1: conversion is valid or not
		//The type of 'd' and 'c' must have some relationship(either parent to child or child to parent).
		
			//Animal an=new Dog();
			//Cat ct=(Cat) an; //valid as per rule 1
			//Dog dg=new Dog();
			//Cat ct=(Cat) dg3B // invalid as per Rulel
			
		//Rule2: assignment is valid or not
		//'C' must be either same or child of 'A'.
		
			//Animal an=new Dog();
			//Cat ct=(Cat) an; //valid as per Rule2
			//Animal an=new Dog();
			//Cat ct=(Dog) an%; //invalid as per Rule2
		
		//Rule3:
		//The underlying object type of 'd' must be either same or child of 'C'.
		
			//Animal an=new Dog();
			//Cat ct=(Cat) an; // invalid as per Rule 3
		
		/*
		//Rule 1, Rule2 Rule 3
		Animal an=new Dog();
		Dog dg=(Dog) an; //Rulel-yes Rule2-yes Rule3=yes
		*/	
		

	}

}
