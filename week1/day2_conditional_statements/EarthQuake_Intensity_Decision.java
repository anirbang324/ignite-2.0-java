package week1.day2_conditional_statements;

import java.io.IOException;
import java.util.Scanner;

public class EarthQuake_Intensity_Decision {
    public static void main(String args[]) throws IOException{
        // fill the code
        Scanner sc = new Scanner(System.in);
        System.out.println("Richter Magnitude:");
        double d = sc.nextDouble();
        if(d >= 8.0){
            System.out.println("Great");
        }
        else if(d<=2.4){
            System.out.println("Micro");
        }
        else if(d>=2.5 && d<=5.4){
            System.out.println("Light");
        }
        else if(d>=5.5 && d<=6.0){
            System.out.println("Moderate");
        }
        else if(d>=6.1 && d<=6.9){
            System.out.println("Strong");
        }
        else if(d>=7.0 && d<=7.9){
            System.out.println("Major");
        }
    }
}
