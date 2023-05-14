package week1.day2_Looping_Statement_For_Loop;

import java.util.Scanner;

public class Generate_the_series {
    public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int res = 3;
		System.out.println(res +" ");
		for(int i=1;i<n;i++){

				res = res*2+1;
				System.out.println(res +" ");
		}
	}
}
