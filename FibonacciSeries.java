package com.company1.Day6LogicalPrograms;
import com.company1.Day6LogicalPrograms.Utility.UtilityFibonacciSeries;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber=0,secondNumber=1;

        int getUserInput = UtilityFibonacciSeries.getInput();
        System.out.print(firstNumber+" "+secondNumber);
        UtilityFibonacciSeries.printFabonic(getUserInput,firstNumber,secondNumber);
    }
}
