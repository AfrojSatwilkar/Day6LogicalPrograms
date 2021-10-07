package com.company1.Day6LogicalPrograms;
import com.company1.Day6LogicalPrograms.Utility.UtilityForSimulateStopwatch;
public class SimulateStopwatch {
    public static void main(String[] args) throws InterruptedException {
        //getting start time
        long startTime=(long) (UtilityForSimulateStopwatch.getTime()/1000.0);
        System.out.println("Program start time : "+startTime/1000.0);

        for(int i=0;i<100;i++) {
            System.out.println(i);
            Thread.sleep(100);
        }
        //getting end time
        long endTime=(long)(UtilityForSimulateStopwatch.getTime()/1000.0);
        System.out.println("End time is : "+endTime/1000.0);

        //program execution time
        System.out.print("Program execution time is : "+(endTime-startTime)/1000.0);

    }
}
