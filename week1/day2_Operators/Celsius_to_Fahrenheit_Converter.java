package week1.day2_Operators;

import java.util.Scanner;

public class Celsius_to_Fahrenheit_Converter {
        public static void main(String[] args){    	   
            Scanner sc = new Scanner(System.in);
            int c;
            double f;
            System.out.println("Enter temparature in Celcius");
            c = sc.nextInt();
            f  = 1.8*c+32;
            System.out.println("The equivalent Temparature in Fahrenheit is "+f+"F");
        }
}
