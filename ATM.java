import java.io.*;
import java.util.*;

public class ATM{
    public static boolean ck(int p){
        int s=0;
        while(p!=0){
            s++;
            p=p/10;
        }
        if(s==4){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long an;
        int pin;
        System.out.println("Enter the Acc no : ");
        an=sc.nextLong();
        System.out.println("Enter the Pin : ");
        pin=sc.nextInt();
        if(!ck(pin)){
            System.out.println("Pin should be 4-digit.");
            return;
        }
        //withdrawal,Deposite,Check Balance
        int bal=2000;
        int wa=0;
        int dp=0;
        while(true){
            System.out.println("ATM functionalities: \n\n1->Check Balance\n2-> Withdrawal\n3->Deposite\n4->Exit\n--Enter your action : ");
            int c=sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Balance : "+bal);
                    break;
                case 2:
                    while(true){
                        if(bal<=1000){
                            System.out.println("You cannot withdraw because of minimum balance");
                            break;
                        }
                        System.out.println("Enter Amount to Withdraw : ");
                        wa=sc.nextInt();
                        if(wa%100!=0){
                            System.out.println("Withdrawal amount should be a multiple of Rs.100. ");
                            continue;
                        }
                        if(wa>20000){
                            System.out.println("Maximum withdrawal limit per transaction is Rs.20,000. ");
                            continue;
                        }
                        if(bal-wa<1000){
                            System.out.println("Minimum account balance should not fall below Rs.1000 after withdrawal.");
                            continue;
                        }
                        bal=bal-wa;
                        System.out.println("Amount is Withdrawn.");
                        break;
                    }
                    break;
                case 3:
                    while(true){
                        System.out.println("Enter the Amount to Deposite : ");
                        dp=sc.nextInt();
                        if(dp<=0){
                            System.out.println("Deposit amount must be greater than Rs.0. ");
                        }
                        else{
                            bal=bal+dp;
                            System.out.println("Amount is deposited.");
                            break;
                        }

                    }
                    break;
                case 4:
                    System.out.println("Thank You ");
                    return;
            }

        }
    }
}