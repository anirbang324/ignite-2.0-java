package week1.day4_String_basics;

import java.util.Scanner;

public class String_Processing {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String s =sc.nextLine();
		String[] sp = s.trim().split("\\s+");
		String res = sp[0];

		for(int i=1;i<sp.length;i++){
			res += " "+sp[i].toUpperCase();
		}
		System.out.println("The processed string is "+res);
	}
}

// Input:

// Enter the input string

//          Amphisoft Technologies
// output:

// The processed string is Amphisoft TECHNOLOGIES