package com.AvgCalc;

import java.util.Scanner;
class Main {

    public static double average(int[] a){

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double avg=sum/a.length;
        return avg;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n=s.nextInt();
        int []a=new int[n];
        System.out.println("Now enter terms-");
        for(int i=0;i<n;i++){

            a[i]=s.nextInt();
        }
        System.out.print("The average is "+average(a));
    }
}
