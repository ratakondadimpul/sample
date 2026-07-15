import java.io.*;
import java.util.*;

public class marks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sid;
        int m1,m2,m3;
        System.out.println("Enter Student Id : ");
        sid=sc.nextInt();
        if(sid<=0){
            System.out.println("Student Id should be Positive.");
            return;
        }
        System.out.println("Enter the m1 : ");
        m1=sc.nextInt();
        if(m1<0 || m1>100){
            System.out.println("Marks should be between 0 and 100.");
            return;
        }
        System.out.println("Enter the m2 : ");
        m2=sc.nextInt();
        if(m2<0 || m2>100){
            System.out.println("Marks should be between 0 and 100.");
            return;
        }
        System.out.println("Enter the m3 : ");
        m3=sc.nextInt();
        if(m3<0 || m3>100){
            System.out.println("Marks should be between 0 and 100.");
            return;
        }
        int tm=m1+m2+m3;
        double avg=(tm)/3.0;
        System.out.printf("Total Marks : %d/300\n",tm);
        System.out.printf("Average : %.2f\n",avg);
        if(avg>=90.0){
            System.out.println("Grade A");
        }
        else if(avg<90.0 && avg>=75.0){
            System.out.println("Grade B");
        }
        else if(avg<75.0 && avg>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

    }
}