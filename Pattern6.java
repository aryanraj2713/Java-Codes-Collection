package com.pattern6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
            sc.close();
        }
    }
}