package javaprogram1;

import java.util.Scanner;

public class SearchProgram {

    public static void main(String[] args) {
        
        //linear Search in single diemntion array

        int a[] ={5,10,15,20,25,32,35,40,45,50};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value you want to find");
        int x = input.nextInt();

        boolean status = false;

        for(int i=0;i<a.length;i++){
            if(x == a[i]){
                System.out.println("Element found at index number: " + i);
                status = true;
                break;
            }
            
            }

            if(status == false){
                System.out.println("Element not fount");
        }

        // Find count of same elements in array

    int b[] ={5,10,15,10,25,10,35,10,45,50};

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value you want to find");
    int y = in.nextInt();
    int count = 0;

    for(int i=0;i<a.length;i++){
        if(y == b[i]){
            System.out.println("Element found at index number: " + i);
            count ++;
            
        }
        
    }
    if(count != 0){
        System.out.println("Number of times element: " + y + " occur in array is: " + count);
    }
    else{
        System.out.println("No such element found");
    }

}

}




