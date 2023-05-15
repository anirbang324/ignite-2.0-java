package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        n =sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
            // Fill your code here
        
     }
}
