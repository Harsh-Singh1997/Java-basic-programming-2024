package javaprogram1;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionDemo {


    public static void main(String[] args) {
        
        System.out.println("program started.......");

        Scanner sc = new Scanner(System.in);

    //Example 1: ArithmeticException
        /* 
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println(100/num); //ArithmeticException
        */

    //Example 2: ArrayIndexOutOfBoundsException
        /* 
        int a[] = new int[5];
        System.out.println("Enter the position you want to enter element:");
        int pos = sc.nextInt();

        System.out.println("Enter the value:");
        int value = sc.nextInt();

        a[pos] = value; //ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));
        */

    //Example 3: NumberFormatException

        /* 
        String s1 = "";

        System.out.println("Enter value in string s1:");
        s1 = sc.next();

        int a = Integer.parseInt(s1); //NumberFormatException

        System.out.println("Value in String is: " + a);
        */

    //Example 4: NullPointerException

        /* 
        String s = null;
        System.out.println("size of string is: " + s.length()); //NullPointerException

        */

        System.out.println("Program completed...........");
        System.out.println("program executed..................");
    }
}
