package javaprogram1;

public class TypeCastingJava {
	
	//Type casting - Converting one data type to another
	
	//Upcasting/Widening - Converting smaller data type to larger data type
	//int --> long
	//float --> double
	
	//Downcasting/Narrowing - Converting larger data type to smaller data type
	//long --> int
	//double --> float

	public static void main(String[] args) {
		
		//Upcasting - automatic process - lower to higher datatype
		
		int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 10.5f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//Downcasting - manual process - higher to lower datatype
		
		double doublevalue2 = 11.50;
		float floatvalue2 = (float) doublevalue2;
		System.out.println(floatvalue2);
		
		long longvalue2 = 10000;
		int intvalue2 = (int) longvalue2;
		System.out.println(intvalue2);
		
		//Example1
		int x = 100;
		double d = x; //Upcasting
		System.out.println(d);
		
		//Example2
		double v= 100.5;
		int u = (int)v; //Downcasting
		System.out.println(u);
	}

}
