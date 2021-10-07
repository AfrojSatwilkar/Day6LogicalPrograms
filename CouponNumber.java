package com.company1.Day6LogicalPrograms;
import com.company1.Day6LogicalPrograms.Utility.UtilityForCouponNumber;
public class CouponNumber {
    public static void main(String[] args) {
        //getting user input
        System.out.print("Enter Number : ");
        int getUserInput=UtilityForCouponNumber.getInput();

        //checking for distinct cards
        int getRandomNumber=UtilityForCouponNumber.checkForCards(getUserInput);
        System.out.print("Coupon Number : "+getRandomNumber);


    }
}
