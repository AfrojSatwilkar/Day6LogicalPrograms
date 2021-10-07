package com.company1.Day6LogicalPrograms;

import com.company1.Day6LogicalPrograms.Utility.UtilityForReverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {

        //getting user input
        System.out.print("Enter Number : ");
        int getUserInput= UtilityForReverseNumber.getInput();

        //reversing number
        int getReverseNumber=UtilityForReverseNumber.reverseNumber(getUserInput);
        System.out.print("Reverse Number : "+getReverseNumber);

    }
}
