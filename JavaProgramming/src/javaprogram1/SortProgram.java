package javaprogram1;

import java.util.Arrays;
import java.util.Scanner;

public class SortProgram {

    public static void main(String[] args) {
        
//Interger sorting using arrays utility
        int a[] = {20,10,30,60,70,40,50,80,100,90};

        System.out.println("Before Sorting..........");
        System.out.println(Arrays.toString(a));
        System.out.println();
        
        Arrays.sort(a); // Sorting int a[]

        System.out.println("After Sorting..........");
        System.out.println(Arrays.toString(a)); 
        System.out.println('\n');

//String sorting using arrays utility
        String s[] = {"A","C","F","B","G","D","E","I","H","J"};

        System.out.println("Before Sorting..........");
        System.out.println(Arrays.toString(s));
        System.out.println();
        
        Arrays.sort(s); //Sorting String s[]

        System.out.println("After Sorting..........");
        System.out.println(Arrays.toString(s)); 
        System.out.println('\n');

//Taking array elements from keyboard and then sorting
        int x[] = new int[6];

        Scanner k = new Scanner(System.in);
        System.out.println("Enter value in array:");
        for(int i = 0; i < x.length;i++){
            x[i] = k.nextInt(); //Entering elements in array from keyboard
        }

        System.out.println("Before Sorting..........");
        System.out.println(Arrays.toString(x));
        System.out.println();

        Arrays.sort(x); // Sorting Array

        System.out.println("After Sorting..........");
        System.out.println(Arrays.toString(x));
        System.out.println();

//Taking String elements from keyboard and then sorting
        String city[] = new String[6];

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter value in array:");
        for(int i = 0; i < x.length;i++){
            city[i] = inp.next(); //Entering elements in string array from keyboard
        }

        System.out.println("Before Sorting..........");
        System.out.println(Arrays.toString(city));
        System.out.println();

        Arrays.sort(city); // Sorting String array

        System.out.println("After Sorting..........");
        System.out.println(Arrays.toString(city));
        System.out.println();
    }

}
