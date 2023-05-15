package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Mahirl_and_Matrix3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt() - 1;
        int p = scanner.nextInt() - 1;
            int[][] matrix = new int[n][n];
            int value = 1;
        
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                        matrix[j][i] = value++;
                    }
                }else{
                    for(int j = n-1; j >= 0; j--){
                        matrix[j][i] = value++;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(matrix[m][p]);
        }
}


// Sample Input 1 :

// 5

// 3

// 2

 

 

// Sample Output 1:

// 1 10 11 20 21

// 2 9 12 19 22

// 3 8 13 18 23

// 4 7 14 17 24

// 5 6 15 16 25

 

// 8