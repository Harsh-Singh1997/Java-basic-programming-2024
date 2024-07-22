package javaprogram1;

public class WrapperClassprogram {

    public static void main(String[] args) {
        
    //String to int using Integer Wrapper Class
        String s1 = "10";
        String s2 = "20";

        int a = Integer.parseInt(s1); // Integer Wrapper clant to change String s1 value to integer
        int b = Integer.parseInt(s2); // Integer Wrapper clant to change String s2 value to integer

        System.out.println(a+b); //Sum of string values by changing values to integer using wrapper class
    
    //String to int using Double Wrapper Class

        String emp1 = "20.3";
        String emp2 = "11.5";

        System.out.println(Double.parseDouble(emp1)+Double.parseDouble(emp2));

    //Int, Double, Char, Boolean --> String
    int c = 10;
    double d = 20.5;
    char ch = 'X';
    boolean bool = false;

    System.out.println(String.valueOf(c));
    System.out.println(String.valueOf(d));
    System.out.println(String.valueOf(ch));
    System.out.println(String.valueOf(bool));
    
    }

}
