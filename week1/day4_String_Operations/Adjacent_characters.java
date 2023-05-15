package week1.day4_String_Operations;

import java.util.Scanner;

public class Adjacent_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String u = "";
        for(int i=0;i<=st.length()-1;i++)
        {
            char c = st.charAt(i);
            u = u+c;
        
        if(i<st.length()-1 && c ==st.charAt(i+1))
        {
            u = u+"*";
        }
        }
        System.out.println("The processed string is "+u);
     }
}


// Sample Input and Output 1:

 

// Enter the string

// hello

// The processed string is hel*lo


// Sample Input and Output 2:

 

// Enter the string

// marvellouss

// The processed string is marvel*lous*s