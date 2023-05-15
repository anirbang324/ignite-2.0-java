package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Array_Deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int numElements = scanner.nextInt();
        int count = 0;
        int[] arr = new int[numElements];
        int[] arrWithoutElement = new int[numElements-1];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < numElements; i++) {
        arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int location = scanner.nextInt();
        if (location <= numElements && location > 0) {
        for (int i = 0; i < numElements ; i++) {
        if(i == location-1)
        continue;
        else
        arrWithoutElement[count++]=arr[i];
        }
        System.out.println("Array after deletion is");
        for (int i = 0; i < numElements-1 ; i++) {
        System.out.println(arrWithoutElement[i]);
        }
        }
        else{
        System.out.println("Invalid Input");
        }
        }
}
