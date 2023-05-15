package week1.day4_String_Operations;

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("The words in the string are");
		String[] w = str.split("\\s+");
		for(int i=0;i<=w.length-1;i++)
		{
			System.out.println(w[i]);
		}
	}
}


// Enter the string

// ABCD Technologies is a private organization

// Sample Output:

// The words in the string are

// ABCD

// Technologies

// is

// a

// private

// organization