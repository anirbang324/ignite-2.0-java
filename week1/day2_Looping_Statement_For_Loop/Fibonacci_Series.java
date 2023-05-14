package week1.day2_Looping_Statement_For_Loop;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill your code here
        System.out.println("Enter the range:");
        int num = sc.nextInt();
        System.out.println("Fibonacci series:");
        int n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<num;++i)
        {
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2= n3;
           
            
        }
    }

}
