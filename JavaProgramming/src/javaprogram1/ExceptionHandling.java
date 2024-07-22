package javaprogram1;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        
        System.out.println("program started.......");

        Scanner sc = new Scanner(System.in);

    //Example 1: Try Catch exception handling
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        try{
        System.out.println(100/num); 
        }
        catch(ArithmeticException e){
            System.out.println("Invalid Input");
        }

        System.out.println("Program completed...........");
        System.out.println("program executed..................");
     
        
    //Multiple Catch block exception handling

    try{
    String s = null;
    System.out.println("size of string is: " + s.length());
    }
   /* catch(ArithmeticException e)
    {
        System.out.println("Exception handle....");
        System.out.println(e.getMessage());
    }
    catch(NullPointerException e)
    {
        System.out.println("Exception handle....");
        System.out.println(e.getMessage()); 
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Exception handle....");
        System.out.println(e.getMessage());  
    }
    catch(NumberFormatException e)
    {
    	System.out.println("Exception handle....");
        System.out.println(e.getMessage());
    }
    */
    catch(Exception e) // Can handle all types of exceptions
    {
    	System.out.println("Exception handle....");
        System.out.println(e.getMessage());
    }
    }
    
}
