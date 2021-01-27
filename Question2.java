package com.company;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        System.out.print("Enter Your Marks: ");
        a = input.nextDouble();

        System.out.println("Grade    Grade point Equivalent    Remarks");

        if(a >= 80 && a <= 100)
        {
            System.out.println("A+               4.00              Outstanding ");
        }

        else if(a >= 75 && a < 80)
        {
            System.out.println("A                3.75              Excellent ");
        }

        else if(a >= 70 && a < 75)
        {
            System.out.println("A-               3.50              Very Good ");
        }

        else if(a >= 65 && a < 70)
        {
            System.out.println("B+               3.25              Good ");
        }

        else if(a >= 60 && a < 65)
        {
            System.out.println("B                3.00              Satisfactory ");
        }

        else if(a >= 55 && a < 60)
        {
            System.out.println("B-               2.75              Above Average ");
        }

        else if(a >= 50 && a < 55)
        {
            System.out.println("C+               2.50              Average ");
        }

        else if(a >= 45 && a < 50)
        {
            System.out.println("C                2.25              Below Average ");
        }

        else if(a >= 40 && a < 45)
        {
            System.out.println("D                2.00              Pass ");
        }

       else
        {
            System.out.println("F                0.00              Fail ");
        }
    }
}
