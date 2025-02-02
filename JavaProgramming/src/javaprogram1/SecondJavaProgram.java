package javaprogram1;

public class SecondJavaProgram {

	public static void main(String[] args) {
		
		System.out.println("Java Program with main class");
		System.out.print('\n');
		
		//For Loop
		for(int i=1;i<=5;i++) {
		
		System.out.println("For loop statement: " + i);

	}
		System.out.print('\n');
		
		//While Loop
		int j = 1;
		while(j<=5) {
			System.out.println("While loop statement: " + j);
			j++;
		}
		System.out.print('\n');
		
		//Do While Loop
		int k=1;
		do {
			System.out.println("Do While statement: " + k);
			k++; 
			
		}
		while(k<=5);
		System.out.print('\n');
		
		//For Loop with Condition
		for(int a =1;a<=10;a++) {
			if(a%2==0)
			{
				System.out.println(a + " is an EVEN number");
			}
			else {
				System.out.println(a + " is an ODD number");
			}
		}
		System.out.print('\n');
		
		//For loop with Break Statement
		
		for(int i =1;1<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("Break statement will run till: " + i);
		}
		System.out.print('\n');
		
		//For loop with Continue statement
		
		for(int b = 1;b<=10;b++) {
			if(b==5) {
				continue;
			}
			System.out.println("Continue statement:" + b);
		}
		System.out.print('\n');
		
		//Continue statement after multiple numbers
		for(int b = 1;b<=10;b++) {
			if(b==3 || b == 5 || b==7) {
				continue;
			}
			System.out.println("Continue statement:" + b);
		}
		System.out.print('\n');
	
	}

}
