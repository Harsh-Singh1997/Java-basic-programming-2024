package javaprogram1;

//A b=(C) d;

public class TypeCastingofObject3 {

	public static void main(String[] args) {
		
	//Rule 1: conversion is valid or not
		//The type of 'd' and 'c' must have some relationship(either parent to child or child to parent).
		
	//Rule2: assignment is valid or not
		//'C' must be either same or child of 'A'.
		
	//Rule3:
		//The underlying object type of 'd' must be either same or child of 'C'.
		
		//Ex1:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rule1-yes Rule2 -yes Rule3 failed
		
		//Ex2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //Rule1 -failed
		
		//Ex3:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rule1-yes Rule2-yes Rules3-failed
		
		//Ex4:
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o;B //Rule1-passed Rule2-failed
		
		//Ex5:
		//String s=new String("welcome");
		//StringBuffer sb=(String) s; //Rule1-passed Rule2-failed
		
		//EX6:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rulel passed Rule2- passed Rule3-failed
		
		//EX7:
		Object o=new String("welcome");
		String s=(String) o; //Rule1-passed Rules2-passed Rule3-passed
		System.out.println(s);

	}

}
