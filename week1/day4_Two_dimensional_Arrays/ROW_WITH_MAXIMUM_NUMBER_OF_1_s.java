package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class ROW_WITH_MAXIMUM_NUMBER_OF_1_s {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<=rows-1; i++){
        for(int j=0; j<=columns-1; j++){
        matrix[i][j]= scanner.nextInt();
        }
        }
        int maxOneRow = 0;
        int maxOneCount = 0;
        for(int i=0; i<=rows-1; i++){
        int onesCount = 0;
        for(int j=0; j<=columns-1; j++){
        if(matrix[i][j] == 1){
        onesCount++;
        }
        }
        if(onesCount > maxOneCount){
        maxOneRow = i;
        maxOneCount = onesCount;
        }
        }
        System.out.println(maxOneRow);
        }
}


// Sample Input1:
// 4
// 4
// 1 0 0 0
// 0 0 1 1
// 1 1 1 0
// 1 0 0 0
// Sample Output1:
// 2