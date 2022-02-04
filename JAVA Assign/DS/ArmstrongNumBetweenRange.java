package com.company;

public class ArmstrongNumBetweenRange {
    static boolean armstrongCheck(int num){
        int o_num=num;
        int ans=0,rem;
        while(o_num!=0){
            rem=o_num%10;
            ans=ans+rem*rem*rem;
            o_num/=10;


        }
        if (ans==num){
            return true;

        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
	int min=100;
    int max=999;
    for(int i=min;i<=max;i++){
        if(armstrongCheck(i)==true) {
            System.out.print(i + " ");
        }
        }
    }
    }

