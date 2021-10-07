package com.company1.Day6LogicalPrograms.Utility;

import java.util.Scanner;

public class UtilityFibonacciSeries {

    public static int getInput() {
        System.out.print("Enter nth Number : ");
        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();
        System.out.println("End no is : " + getUserInput);
        return getUserInput;
    }

    public static void printFabonic(int getUserInput,int firstNumber,int secondNumber) {
        for(int i=2;i<getUserInput;++i)
        {

            int nextNumber=firstNumber+secondNumber;
            System.out.print(" "+nextNumber);
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
