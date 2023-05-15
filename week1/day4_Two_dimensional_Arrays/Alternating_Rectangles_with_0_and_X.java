package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Alternating_Rectangles_with_0_and_X {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();    
            if(rows <= 2 || columns <= 2){
                return;
            }
        
            char[][] matrix = new char[rows][columns];
        
            int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
            char currentChar = 'X';
            while(left <= right && top <= bottom){
                for(int i = left; i <= right; i++){
                         matrix[top][i] = currentChar;
                }
               top++;
               for(int i = top; i <= bottom; i++){
                   matrix[i][right] = currentChar;
               }
               right--;
               if(top <= bottom){
                   for(int i = right; i >= left; i--){
                       matrix[bottom][i] = currentChar;
                   }
                   bottom--;
               }
               if(left <= right){
                   for(int i = bottom; i >= top; i--){
                       matrix[i][left] = currentChar;
                   }
                   left++;
               }
               currentChar = currentChar == 'X'? '0' : 'X';
            }
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    System.out.println(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}


// Sample Input1:

// 3
// 3

// Sample Output1:

// X X X
// X 0 X
// X X X 