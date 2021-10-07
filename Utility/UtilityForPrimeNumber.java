package com.company1.Day6LogicalPrograms.Utility;

import java.util.Scanner;

public class UtilityForPrimeNumber {

    //getting user input
    public static int getInput() {

        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();
        return getUserInput;
    }

    //checking for prime number
    public static int checkPrimeNumber(int checkPrime) {
        int flag=0;
        if (checkPrime==0 || checkPrime==1){
            flag=1;
            return flag;
        }
        else{
            for(int i=2;i<checkPrime;i++) {
                if(checkPrime%i==0) {
                    flag=1;
                    break;
                }
            }return flag;
        }

    }
}
