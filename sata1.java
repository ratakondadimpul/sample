import java.io.*;
import java.util.*;

public class sata1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the 1st Angle : ");
        x=sc.nextInt();
        System.out.println("Enter the 2nd Angle : ");
        y=sc.nextInt();
        System.out.println("Enter the 3rd Angle : ");
        z=sc.nextInt();

        if(x+y+z !=180){
            System.out.println("Invalid Triangle");
            return;
        }
        if(x<=0 || x>=180){
            System.out.println("Invalid Triangle");
            return;
        }
        if(y<=0 || y>=180){
            System.out.println("Invalid Triangle");
            return;
        }
        if(z<=0 || z>=180){
            System.out.println("Invalid Triangle");
            return;
        }

        if(x<90 && y<90 && z<90){
            System.out.println("Acute Triangle");
        }
        else if(x==90 || y==90 || z==90){
            System.out.println("Right Triangle");
        }
        else if(x>90 || y>90 || z>90){
            System.out.println("Obtuse Triangle");
        }

    }
}