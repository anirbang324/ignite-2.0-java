package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
     }
}
