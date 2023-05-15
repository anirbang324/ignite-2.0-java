package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    
    int s = 0;
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            s +=arr[i][j];
        }
    }
    System.out.println("The sum of the elements in the matrix is "+s);
}
}
