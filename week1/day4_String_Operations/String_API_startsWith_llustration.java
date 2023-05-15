package week1.day4_String_Operations;

import java.util.Scanner;

public class String_API_startsWith_llustration {
    public static void main(String[] args) throws Exception {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		System.out.println("Enter the start string");
		String chk = sc.nextLine();
		if(st.startsWith(chk)){
			System.out.println("\"" +st+  "\" starts with \"" +chk+ "\"");
		}
		else{
			System.out.println("\"" +st+ "\" does not start with \"" +chk+ "\"");
		}
	}
}

// Enter the string

// Technology

// Enter the start string

// Tech

// "Technology" starts with "Tech"
