package week1.day4_Arrays_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Median {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);        
		System.out.println("Enter the number of elements in the array");
           int n=sc.nextInt();       
		   System.out.println("Enter the elements in the array");
           int arr[]=new int[n];
           int c = 0;
		   double d = 0;
		   String res ="";
           for(int i=0;i<n;i++)
		   {
           arr[i]=sc.nextInt();
		   }
		   Arrays.sort(arr);
		   if(n%2!=0){
			   d = (double)(arr[n/2]);
			   res = String.format("%.2f",d);
			   System.out.println("The median of the array is "+res);
		   }
		   else{
			    d = (double)((arr[(n-1)/2]+arr[n/2])/2.0);
				res = String.format("%.2f",d);
			   System.out.println("The median of the array is "+res);
			   
		   }

	}
}
