package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class IPL_Pattern {
    public static void main(String[] args) {
        Scanner ani = new Scanner(System.in);
        int n = ani.nextInt();
        for(int i=1;i<=n;i++){
            if(i<n/2){
                for(int j=i;j<=n/2;j++)
                System.out.print("C");
                for(int k=1;k<=2*(i-1);k++)
                System.out.print("S");
                for(int j=i;j<=n/2;j++)
                System.out.print("C");    
            }
            else if(i>n/2+1){
                for(int j=n/2+1;j<=i;j++)
                System.out.print("K");
                for(int k=2*n;k>2*i;k--)
                System.out.print("S");
                for(int j=n/2+1;j<=i;j++)
                System.out.print("K");
            }
            else{
                for(int j=1;j<=n;j++)
                System.out.print("S");
            }
            System.out.println();
        }
    }
}
