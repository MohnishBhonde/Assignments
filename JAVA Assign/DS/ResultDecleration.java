package com.company;
import java.util.*;
public class ResultDecleration{
        static String declareResults(double Sub1Marks, double Sub2Marks, double Sub3Marks) {
        if(Sub1Marks>=60.0 && Sub2Marks>=60.0 && Sub3Marks>=60.0) {
            return "Passed";
        }
        else if((Sub1Marks>=60.0 && Sub2Marks>=60.0 && Sub3Marks<60)
            || (Sub1Marks<60.0 && Sub2Marks>=60.0 && Sub3Marks>=60)
            ||(Sub1Marks>=60.0 && Sub2Marks<60.0 && Sub3Marks>=60)){
            return "promoted";

        }
        else{
            return "Fail";
        }

    }
    public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter subject 1 marks:");
            double Sub1Marks=input.nextDouble();
            System.out.print("Enter subject 2 marks:");
            double Sub2Marks=input.nextDouble();
            System.out.print("Enter subject 3 marks:");
            double Sub3Marks=input.nextDouble();
            System.out.print("Result:"+declareResults(Sub1Marks,Sub2Marks, Sub3Marks));
    }
}