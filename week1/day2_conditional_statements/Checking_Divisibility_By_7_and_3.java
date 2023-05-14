package week1.day2_conditional_statements;

import java.util.Scanner;

public class Checking_Divisibility_By_7_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0 && n%3==0){
            System.out.println(n+" is divisible by both 7 and 3");
        }
        else{
             System.out.println(n+" is not divisible by both 7 and 3");
        }
     }
}
