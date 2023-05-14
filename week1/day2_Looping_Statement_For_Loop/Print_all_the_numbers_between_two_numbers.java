package week1.day2_Looping_Statement_For_Loop;

import java.util.Scanner;

public class Print_all_the_numbers_between_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
            
        
     }
}
