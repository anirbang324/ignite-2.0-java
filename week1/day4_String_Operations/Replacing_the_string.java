package week1.day4_String_Operations;

import java.util.Scanner;

public class Replacing_the_string {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		String s = sc.nextLine();
		System.out.println("Enter the old name of the company");
		String o = sc.nextLine();
		System.out.println("Enter the new name of the company");
		String n = sc.nextLine();
		System.out.println("The content of the modified document is");
		System.out.println(s.replaceAll(o,n));
	}
}

// Enter the content of the document
// Pure is a private organisation. Pure is a product based company. NewApp is a Pure product
// Enter the old name of the company
// Pure
// Enter the new name of the company
// Pixel
// The content of the modified document is
// Pixel is a private organisation. Pixel is a product based company. NewApp is a Pixel product