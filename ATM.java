import java.io.*;
import java.util.*;

public class ATM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int an,pin;
        System.out.println("Enter the Acc no : ");
        an=sc.nextInt();
        System.out.println("Enter the Pin : ");
        pin=sc.nextInt();
        System.out.println(length(pin));
    }
}