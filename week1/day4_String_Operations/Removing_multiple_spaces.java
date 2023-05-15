package week1.day4_String_Operations;

import java.util.Scanner;

public class Removing_multiple_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st =sc.nextLine();
        String up = st.replaceAll("\\s+"," ");
        System.out.println("The processed string is "+st);
        
     }
}

// Enter the string

// Java             is                           an                 Object Oriented Prog Language

// The processed string is Java is an Object Oriented Prog Language
