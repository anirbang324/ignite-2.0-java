package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Mahirl_and_Matrix2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
 
        int[][] mtrx = new int[n][n];
        int c = 1;
 
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    mtrx[i][j] = c++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    mtrx[i][j] = c++;
                }
            }
        }
 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(mtrx[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(mtrx[row-1][col-1]);
     }
}


// Sample Input 1 :

// 5

// 3

// 2

 

 

// Sample Output 1:

// 1 2 3 4 5

// 10 9 8 7 6

// 11 12 13 14 15

// 20 19 18 17 16

// 21 22 23 24 25

 

// 12