package week1.day2_Operators;

import java.util.Scanner;

public class Odd_or_even {
    public static void main(String[] args){    	     
        //Fill your code
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter any number: ");
     int n=sc.nextInt();

     if((n&1)==1) {
         System.out.println(n+" is odd.");
     }
     else{
         System.out.println(n+" is even.");
     }
 }
    
}
