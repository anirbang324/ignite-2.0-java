package week1.day4_String_basics;

import java.util.Scanner;

public class toUpperCase {
    public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String s = sc.nextLine();
		System.out.println("Name:"+s.toUpperCase());
	}
}

// Sample Input/Output -1 :
// Enter the name:
// Willam EdilBert
// Name:WILLAM EDILBERT
