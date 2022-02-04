package com.company;
import java.util.*;
class TaxAmount{
    public static double calculateTaxAmount(double CTC){
        if(CTC>=180000){
            return CTC;
        }
        else if(CTC>=181001 && CTC<=300000){
            CTC=CTC-CTC*0.1;
            return CTC;
        }
        else if(CTC>=300001 && CTC<=500000) {
            CTC = CTC - CTC * 0.2;
            return CTC;
        }
        else{
            CTC=CTC-CTC*0.3;
            return CTC;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CTC:");
        double CTC = input.nextDouble();
        System.out.print("CTC after deducing Tax and Tax:" + calculateTaxAmount(CTC));
    }
}