package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Mahirl_and_Matrix {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for(int i=0; i<size; i++)
        {
        matrix[i][0] = size * (i+1);
        int currentVal = matrix[i][0];
        for(int j=1; j<size; j++)
        {
        matrix[i][j] = currentVal - 1;
        currentVal--;
        }
        }
        for(int i=0; i<size; i++)
        {
        for(int j=0; j<size; j++)
        {
        System.out.println(matrix[i][j] + " ");
        }
        System.out.println();
        }
        System.out.println("\n" + matrix[row-1][column-1]);
        }
}



// Sample Input 1 :

// 5

// 3

// 2

 

// Sample Output 1:

// 5 4 3 2 1

// 10 9 8 7 6

// 15 14 13 12 11

// 20 19 18 17 16

// 25 24 23 22 21

 

// 14