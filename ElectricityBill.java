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

    public static Boolean ck(String s){
        if(s.isEmpty()){
            System.out.println("Units should not be empty.");
            return false;
        }
        for(char i :s.toCharArray()){
            if(!Character.isDigit(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String units_s;
        int units_c;
        while(true){
            System.out.printf("Enter the units Consumed : ");
            units_s=sc.nextLine().trim();

            if(!ck(units_s)){
                System.out.printf("Units should be an Integer.\n");
                continue;
            }
            try{
                units_c=Integer.parseInt(units_s);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Integer is too long.");
            }
        }
        
        double charge=calculateCharge(units_c);
        double tax=calculateTax(charge);
        double total_charge=generateTotalBill(units_c);
        System.out.println("\nEnergy charged : "+charge);
        System.out.println("Tax : "+tax);
        System.out.println("Final bill amount : "+total_charge);
    }
}