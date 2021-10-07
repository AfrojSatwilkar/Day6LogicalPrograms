package com.company1.Day6LogicalPrograms;

import com.company1.Day6LogicalPrograms.Utility.UtilityForReverseANumber;

public class ReverseANumber {
    public static void main(String[] args) {

        //getting user input
        System.out.print("Enter Number : ");
        int getUserInput= UtilityForReverseANumber.getInput();

        //reversing number
        int getReverseNumber=UtilityForReverseANumber.reverseNumber(getUserInput);
        System.out.print("Reverse Number : "+getReverseNumber);

    }
}
