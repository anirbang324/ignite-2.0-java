package week1.day2_Looping_Statement_For_Loop;

import java.util.Scanner;

public class Generate_Series {
    public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int v = 4, b = 8;
		System.out.print(v+" ");
		for(int i=1;i<n;i++){
			v =v *b;
			System.out.print(v+" ");
			b=b/2;
		}
	}
}
