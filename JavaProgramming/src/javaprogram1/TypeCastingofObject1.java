package javaprogram1;

class Parent{
	
	String name = "Harsh";
	
	void m1() {
		System.out.println("This is m1 from parent.........");
	}
}

class Child extends Parent{
	 int id = 101;
	 
	 void m2() {
		 System.out.println("This is m2 from child.........");
	 }
}

public class TypeCastingofObject1 {
	
	public static void main(String[] args) {
		
		/*
		Child c = new Child();
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		*/
		
		/*
		//Upcasting of object
		Parent p = new Child(); 
		System.out.println(p.name);
		p.m1();	
		//System.out.println(p.id); is not allowed
		//p.m2(); is not allowed;
		*/
		
		/*
		//Downcasting of object : ClassCastException 
		Parent p = new Parent();
		Child c = (Child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		*/
		
	}

}
