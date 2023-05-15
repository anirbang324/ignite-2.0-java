package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }       
     }
}
