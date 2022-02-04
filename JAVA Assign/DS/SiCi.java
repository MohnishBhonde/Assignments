


import java.util.*;
public class SiCi {
    public static double simpleInterest(double principalAmount, int time, double interestRate){
        double SI=principalAmount*time*interestRate;
        return SI;
    }
    public static double compoundInterest(double principalAmount, int time, double interestRate){
        double CI=(principalAmount*Math.pow((1+interestRate),time)-principalAmount);
        return CI;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        double principalAmount=input.nextDouble();
        System.out.print("Enter Principal time:");
        int time=input.nextInt();
        System.out.print("Enter Principal Amount:");
        double interestRate=input.nextDouble();

        System.out.print("Simple Interest:"+ simpleInterest(principalAmount, time,  interestRate));
        System.out.print("Compound Interest:"+ compoundInterest(principalAmount ,time,  interestRate) );


    }
}

