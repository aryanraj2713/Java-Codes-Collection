package com.JavaCalc;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("JAVA CALCULATOR");
        System.out.println("""
                Type the function you want to perform
                1 for Add\s
                2 for Subtract
                3 for Multiply
                4 for Divide
                \s""");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Input 1st number");

        int a = sc.nextInt();
        System.out.println("First Number is"+" "+a);
        System.out.println("Input Second number");
        int b = sc.nextInt();
        System.out.println("Second Number is"+" "+b);
        System.out.println("Function(number) you want to perform is" + "  " + s);



        if (s == 1) {
            int c = a + b;
            System.out.println("Sum="+c);
        }else if (s == 2) {
            int d= a-b;
            System.out.println("Diffrence="+d);
        }else if (s==3){
            int e =a*b;
            System.out.println("Product="+e);
        }else if (s==4){
            int f = a/b;
            System.out.println("Quotient"+f);
        }else{
            System.out.println("error;enter a valid functon");
        }
        sc.close();


    }
}
