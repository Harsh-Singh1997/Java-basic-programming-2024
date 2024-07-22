package javaprogram1;

public class ThirdJavaProgram {

    public static void main(String[] args) {
        int a[] = {100,200,300,400,500,600};

        //Array length
        System.out.println("length of array is: " + a.length);
        System.out.print('\n');

        //Read all values from string
        for(int i = 0;i<a.length;i++){
            System.out.println("Value of array in position " + i + " is: " + a[i]);
        }
        System.out.print('\n');

        //Read all value of array using for-each loop
        for(int x: a){
            System.out.println("Value of array is: " + x); 
        }

    }
    
}
