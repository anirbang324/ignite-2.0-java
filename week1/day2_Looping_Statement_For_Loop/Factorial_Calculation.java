package week1.day2_Looping_Statement_For_Loop;

import java.util.Scanner;

public class Factorial_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
         int n = 1;
         
        for(int i=2;i<v+1;i++){
            n *=i;
        }
        System.out.println(n);
        // Fill your code here
    
 }
}
