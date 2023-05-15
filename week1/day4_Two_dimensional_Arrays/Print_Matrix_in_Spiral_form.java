package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Print_Matrix_in_Spiral_form {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] spiralMatrix = new int[rows][columns];
        for(int i=0; i<=rows-1; i++){
        for(int j=0; j<=columns-1; j++){
        spiralMatrix[i][j]= scanner.nextInt();
        }
        }
        int minRow = 0;
        int minCol = 0;
        int maxRow = spiralMatrix.length-1;
        int maxCol = spiralMatrix[0].length-1;
        int totalElements = rows * columns;
        int count = 0;
        while(count < totalElements){
        if(count < totalElements){
        for(int i=minRow,j=minCol; j<=maxCol; j++){
        System.out.print(spiralMatrix[minRow][j] + " ");
        count++;
        }
        }
        minRow++;
        if(count < totalElements){
        for(int i=minRow,j=maxCol; i<=maxRow; i++){
        System.out.print(spiralMatrix[i][maxCol] + " ");
        count++;
        }
        }
        maxCol--;
        if(count < totalElements){
        for(int i=maxRow,j=maxCol; j>=minCol; j--){
        System.out.print(spiralMatrix[maxRow][j] + " ");
        count++;
        }
        }
        maxRow--;
        if(count < totalElements){
        for(int i=maxRow,j=minCol; i>=minRow; i--){
        System.out.print(spiralMatrix[i][minCol] + " ");
        count++;
        }
        }
        minCol++;
        }
        System.out.println();
        }
}


// Sample Input1:
// 4
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Sample Output1:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10