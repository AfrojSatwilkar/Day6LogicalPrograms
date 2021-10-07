package com.company1.Day6LogicalPrograms;
import com.company1.Day6LogicalPrograms.Utility.UtilityForPerfectNumber;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.print("Enter Number : ");

        //getting user input
        int getUserInput=UtilityForPerfectNumber.getInput();

        //displaying user input
        System.out.println("User Input is : "+getUserInput);

        //checking number perfect or not
        UtilityForPerfectNumber.displayPerfectOrNot(getUserInput);



    }
}
