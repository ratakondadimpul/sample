import java.io.*;
import java.util.*;


public class ElectricityBill{

    public static double calculateCharge(int units){
        if(units<=100){
            return units*5.0;
        }
        else if(units>100 && units<=300){
            return units*7.0;
        }
        else{
            return units*10.0;
        }
    }
    public static double calculateTax(double amount){
        return amount*0.05;
    }
    public static double generateTotalBill(int units){
        return calculateCharge(units)+(calculateTax(calculateCharge(units)));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the units Consumed : ");
        int units_c=sc.nextInt();
        double charge=calculateCharge(units_c);
        double tax=calculateTax(charge);
        double total_charge=generateTotalBill(units_c);
        System.out.println("Energy charged : "+charge);
        System.out.println("Tax : "+tax);
        System.out.println("Final bill amount : "+total_charge);


    }
}