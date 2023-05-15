package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class flag_pattern_italy {
    public static void main(String[] args) {
        Scanner ani = new Scanner(System.in);
        int n = ani.nextInt();

        int m = n*3/2;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<n/2){
                    System.out.print("( ");
                }
                else if(j<m-n/2){
                    System.out.print("# ");
                }
                else{
                    System.out.print(") ");
                }
            }
            System.out.println();
        }
     }
}
