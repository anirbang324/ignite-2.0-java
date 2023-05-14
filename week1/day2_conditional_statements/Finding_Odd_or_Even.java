package week1.day2_conditional_statements;

import java.util.Scanner;

public class Finding_Odd_or_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n%2==0)
        {
        System.out.println(n+" is an even number");
        }
        else{
    System.out.println(n+" is an odd number");
        }   
     }
}
