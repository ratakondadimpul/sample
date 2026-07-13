/*Consider a simple program to classify a triangle. Its inputs is a triple of positive integers (say
x, y, z) and the date type for input parameters ensures that these will be integers greater than 0
and less than or equal to 100. The program output may be one of the following words:
[Scalene; Isosceles; Equilateral; Not a triangle; Invalid Input] */

import java.io.*;
import java.util.*;

public class Triangle{
    public static void main(String args[]){
        String xs,ys,zs;
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        
        while (true){
            try{
                System.out.printf("\nEnter the x value : ");
                xs=sc.nextLine();
                x=Integer.parseInt(xs);
                if(x<=0 || x>100){
                    System.out.printf("X should be positive and less than 101");
                    continue;
                }
                break;
            }
            catch(Exception e){
                System.out.printf("Should be an Integer.");
                continue;
            }
        }
        
        
        while (true){
            try{
                System.out.printf("\nEnter the y value : ");
                ys=sc.nextLine();
                y=Integer.parseInt(ys);
                if(y<=0 || y>100){
                    System.out.printf("Y should be positive and less than 101");
                    continue;
                }
                break;
            }
            catch(Exception e){
                System.out.printf("Should be an Integer.");
                continue;
            }
        }
        while (true){
            try{
                System.out.printf("Enter the z value : ");
                zs=sc.nextLine();
                z=Integer.parseInt(zs);
                if(z<=0 || z>100){
                    System.out.printf("Z should be positive and less than 101\n");
                    continue;
                }
                break;
            }
            catch(Exception e){
                System.out.printf("Should be an Integer.");
                continue;
            }
        }
        

        if(x+y>z && y+z>x && z+x>y){
            if(x==y && y==z){
                System.out.printf("Triangle is Equilateral");
            }
            else if(x==y || y==z || z==x){
                System.out.printf("Triangle is Isosceles");
            }
            else{
                System.out.printf("Triangle is Scalene");
            }
        }
        else{
            System.out.printf("Not a Triangle");
        }
    }
}