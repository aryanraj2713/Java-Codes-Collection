package com.fibono;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0){
            System.out.print(1);
        }else if(n==1){
            System.out.print(1+" ");
            System.out.print(1);
        }else{
            System.out.print(1+" ");
            System.out.print(1+" ");
            int a=1;
            int b=1;

            for(int i=2;i<=n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
