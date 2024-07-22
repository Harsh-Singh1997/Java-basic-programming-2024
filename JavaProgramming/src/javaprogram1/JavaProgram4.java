package javaprogram1;

import java.util.Scanner;

public class JavaProgram4 {

    public static void main(String arg[]){
        
        // two dimensional array
        int a[][] = new int[2][2];
        Scanner in = new Scanner(System.in);

        // Enter value in array
        System.out.println("Enter the values:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                a[i][j] = in.nextInt();
            }
        }
        System.out.print('\n');

        //read value for array
        System.out.println("Value in Array is:");
        System.out.println("Enter the value");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(a[i][j]);
                System.out.print('\t');
            } System.out.print('\n');
        }



    }
    
}
