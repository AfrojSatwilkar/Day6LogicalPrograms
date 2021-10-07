package com.company1.Day6LogicalPrograms.Utility;

import java.util.Scanner;

public class UtilityForPerfectNumber {

    public static int getInput() {

        Scanner scanInput = new Scanner(System.in);
        int getUserInput = scanInput.nextInt();
        return getUserInput;
    }

    public static int displayPerfectOrNot(int checkNumber) {
        int add=0;
        //getting user input
        for(int i=1;i<checkNumber;i++) {
            //checking divisible or not
            if(checkNumber%i==0)
            {
                //displaying perfect divisor
                System.out.println("Divisor number are : "+i);

                //adding every divisor
                add=add+i;
            }
        }

        //checking perfect number or not
        if(add==checkNumber) {
            System.out.print(checkNumber+" : is a perfect number");
        }else {
            System.out.print(checkNumber+" : is not a perfect number");
        }
        return add;

    }
}
