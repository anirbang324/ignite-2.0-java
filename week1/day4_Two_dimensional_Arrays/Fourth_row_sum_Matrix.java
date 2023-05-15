package week1.day4_Two_dimensional_Arrays;

import java.util.Scanner;

public class Fourth_row_sum_Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[3][3];

        System.out.println("Enter the 3x3 matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[4][4];
        for(int i=0;i<3;i++){
            int rs = 0;
            for(int j=0;j<3;j++){
                mat2[i][j] = mat1[i][j];
                rs += mat1[i][j];
            }
            mat2[i][3] = rs;
        }

        for(int j=0;j<3;j++){
            int cs = 0;
            for(int i=0;i<3;i++){
                cs+= mat1[i][j];
            }
            mat2[3][j] = cs;
        }

        int frs = 0, fcs = 0;
        for(int i=0;i<3;i++){
            frs += mat2[3][i];
            fcs += mat2[i][3];
        }
        mat2[3][3] = frs;
        System.out.println("The sum matrix is");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}


// Sample Input and Output:
// Enter the 3x3 matrix
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// The sum matrix is
// 1 2 3 6 
// 1 2 3 6 
// 1 2 3 6 
// 3 6 9 18 