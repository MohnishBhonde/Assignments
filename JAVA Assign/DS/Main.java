package com.company;
import java.util.*;

class Login{
    static String UserID="Ajay";
    static String Password="Password";
    static boolean loginUser(String user,String pass){
        if(UserID.equals(user) && Password.equals(pass)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        int attempt = 0;
        do {
            System.out.print("Enter UserID:");
            user = input.nextLine();
            System.out.print("Enter Password");
            pass = input.nextLine();
            boolean ans = loginUser(user, pass);
            if (ans == true) {
                System.out.print("Welcome Ajay");
                break;

            } else if (ans == false && attempt < 3) {
                System.out.print("You have entered wrong credentials, please enter right credentials");
                attempt += 1;
            }
        }while (attempt != 3) ;
            if (attempt >= 3) {
                System.out.print("You have entered wrong credentials 3 times" + "\n Contact Admin");
            }


        }

    }