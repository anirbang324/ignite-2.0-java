package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Finding_the_Sum_of_Array_Elements {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int j : arr){
			sum = sum+j;
		}
		System.out.println("The sum of the elements in the array is "+sum);
	}
}
