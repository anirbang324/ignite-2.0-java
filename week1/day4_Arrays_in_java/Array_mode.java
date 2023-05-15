package week1.day4_Arrays_in_java;

import java.util.Scanner;

class Array_Mode {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int mode = arr[0], maxc = 1;
		for(int i=0;i<n;i++){
			int c = 0;
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j])
				++c;
			}
			if(c>maxc){
				maxc = c;
				mode = arr[i];
			}
		}
		if(maxc == 1){
			System.out.println("The mode of the array is none");
		}
		else{
			System.out.println("The mode of the array is"+mode);
		}

	}

}
