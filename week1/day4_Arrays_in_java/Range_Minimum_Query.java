package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Range_Minimum_Query {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i <= n - 1; i++){
            array[i] = scanner.nextInt();
        }
        int queries = scanner.nextInt();
        for(int i = 0; i <= queries - 1; i++){
            int leftIndex = scanner.nextInt() - 1;
            int rightIndex = scanner.nextInt() - 1;
            int minValue = array[leftIndex];
            for(int j = leftIndex + 1; j <= rightIndex; j++){
                if(array[j] < minValue){
                    minValue = array[j];
                }
            }
            System.out.println(minValue);
        }
    }
}
