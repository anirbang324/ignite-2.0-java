package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Minimum_Element_In_The_Matrix {
    public static void main(String args[]){
        Scanner ani = new Scanner(System.in);
        int m = ani.nextInt();
        int n = ani.nextInt();
        int[][] mat  = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = ani.nextInt();
            }
        }
        int min = mat[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]<min){
                    min = mat[i][j];
                }
            }
        }
        System.out.println("The minimum element is "+min);
    }
}
