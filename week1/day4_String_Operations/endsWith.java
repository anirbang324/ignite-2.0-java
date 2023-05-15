package week1.day4_String_Operations;

import java.util.Scanner;

public class endsWith {
    public static void main(String[] args) throws Exception {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		System.out.println("Enter the end string");
		String chk = sc.nextLine();
		if(st.endsWith(chk)){
			System.out.println("\"" +st+  "\" ends with \"" +chk+ "\"");
		}
		else{
			System.out.println("\"" +st+ "\" does not end with \"" +chk+ "\"");
		}
	}
}


 

// Sample Input and Output 1:

// Enter the string

// Technology

// Enter the end string

// Tech

// "Technology" does not end with "Tech"