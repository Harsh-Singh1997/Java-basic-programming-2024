package javaprogram1;

import java.util.Scanner;

public class TryCatchFinallyBlockExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("program started.......");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        try{
        System.out.println(100/num); 
        }
        catch(ArithmeticException e){
        	System.out.println("Exception handle....");
            System.out.println(e.getMessage());
        }
        finally // Finally block will always execute independent of try-catch exception handling
        {
        System.out.println("Finally block will always execute............");
        }

        System.out.println("Program completed...........");
        System.out.println("program executed..................");

	}

}
