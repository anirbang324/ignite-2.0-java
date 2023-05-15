package week1.day4_Arrays_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Scalar_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            array2[i] = scanner.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        reverseArray(array2);
        int product = 0;
        for (int i = 0; i <= n - 1; i++) {
            product = product + array1[i] * array2[i];
        }
        System.out.println(product);
    }

    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
