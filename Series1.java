package com.company;

import java.util.Scanner;

public class Series1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your Last Number: ");
         n = input.nextInt();

         for (int i = 1 ; i <= n ; i++)
         {
             if(i%2 == 0)
             {
                 System.out.println(i);
             }
         }

    }
}
