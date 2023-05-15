package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Sort_by_Shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int index = 0, count = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                index = i;
                count++;
            }
        }
        if (arr[size - 1] > arr[0]) {
            index = size - 1;
            count++;
        }
        if (count == 0) {
            System.out.println(0);
        } else if (count > 1) {
            System.out.println(-1);
        } else {
            System.out.println(size - 1 - index);
        }
        scanner.close();
    }
}
