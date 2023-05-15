package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Row_sum_and_Column_sum {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the row size");
        
        int m = sc.nextInt();
        System.out.println("Enter the column size");
        int n = sc.nextInt();
         System.out.println("Enter the matrix values");
         int mat[][] = new int[m][n];
         for(int i=0;i<=m-1;i++){
             for(int j=0;j<=n-1;j++){
                 mat[i][j] = sc.nextInt();
             }
         }
         System.out.println("The matrix is");
         for(int i=0;i<=m-1;i++){
             for(int j=0;j<=n-1;j++){
                 System.out.println(mat[i][j]+" ");
             }
             System.out.println();
         }

         for(int i=0;i<=m-1;i++){
             int rowsum = 0;
             for(int j=0;j<=n-1;j++){
                 rowsum += mat[i][j];
             }
             System.out.println("Row "+(i+1)+" sum is "+rowsum);
         }

         for(int j=0;j<=n-1;j++){
             int colsum = 0;
             for(int i=0;i<=m-1;i++){
                 colsum+=mat[i][j];
             }
             System.out.println("Column "+(j+1)+" sum is "+colsum);
         }     
        }
}


// Enter the row size

// 2

// Enter the column size

// 2

// Enter the matrix values

// 1

// 5

// 4

// 7

// The matrix is

// 1 5

// 4 7

// Row 1 sum is 6

// Row 2 sum is 11

// Column 1 sum is 5

// Column 2 sum is 12