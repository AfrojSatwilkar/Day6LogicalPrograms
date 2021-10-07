package com.company1.Day6LogicalPrograms;
import com.company1.Day6LogicalPrograms.Utility.UtilityForPrimeNumber;
public class PrimeNumber {
    public static void main(String[] args) {

        //getting user input
        System.out.print("Enter Number : ");
        int getUserInput=UtilityForPrimeNumber.getInput();

        //displaying input
        System.out.println("User No is : "+getUserInput);

        //checking prime or not
        int primeCheck=UtilityForPrimeNumber.checkPrimeNumber(getUserInput);

        if(primeCheck==0) {
            System.out.println(getUserInput+" : is a Prime number");
        }else {
            System.out.println(getUserInput+" : is not a Prime number");
        }

    }
}
