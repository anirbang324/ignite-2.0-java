package week1.day4_String_Operations;

import java.util.Scanner;

public class String_Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String s = sc.nextLine();
        String new1 = "";
        char c;
    
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            new1 = c+new1;
        }
        System.out.println("Reverse of the string is "+new1);
        }
}


// Sample Input and Output:


// Enter a string to reverse

// Jhon

// Reverse of the string is nhoJ