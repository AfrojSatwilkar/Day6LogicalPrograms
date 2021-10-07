package com.company1.Day6LogicalPrograms.Utility;

import java.util.Scanner;

public class UtilityForReverseANumber {
    //getting user input
    public static int getInput() {
        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();
        return getUserInput;
    }

    //condition for reverse a number
    public static int reverseNumber(int getUserInput) {
        int lastNumber;
        int reverseNumber=0;
        while(getUserInput!=0) {
            lastNumber=getUserInput%10;

            //adding remainder to given number
            reverseNumber= (reverseNumber*10)+lastNumber;
            getUserInput=getUserInput/10;
        }
        return reverseNumber;
    }
}
