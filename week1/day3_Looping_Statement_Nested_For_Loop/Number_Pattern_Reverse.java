package week1.day3_Looping_Statement_Nested_For_Loop;

import java.util.Scanner;

public class Number_Pattern_Reverse {
    public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=n;i>=1;i--){
			for(j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
