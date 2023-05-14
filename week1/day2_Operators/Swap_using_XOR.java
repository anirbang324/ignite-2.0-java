package week1.day2_Operators;

import java.util.Scanner;

public class Swap_using_XOR {
    public static void main(String[] args){    	     
        Scanner ani = new Scanner(System.in);
        
        System.out.println("Enter the two numbers");
        int x = ani.nextInt();
        int y = ani.nextInt();
        x  = x ^ y;
        y = x ^ y;
        x  = x ^ y;
        System.out.println("The two values after swapping are");
        System.out.println(x);
        System.out.println(y);

 }
}
