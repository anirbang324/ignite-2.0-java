package week1.day4_String_basics;

import java.util.Scanner;

public class String_Operations_Length_Uppercase_Concat_Compare {
    public static void main(String[] args) {
        
        // Fill your code here
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b=sc.nextLine();
        System.out.println("The length of the first string is"+(a.length()));
        System.out.println("The length of the second string is"+(b.length()));
        System.out.println("The uppercase of the first string is"+(a.toUpperCase()));
        System.out.println("The uppercase of the second string is"+(b.toUpperCase()));
         System.out.println("The concatenated string is "+(a.concat(b)));
         int c=a.compareTo(b);
         if(c==0)
         {
                System.out.println("Both the input strings are the same");
         }
         else if(c<0)
         {
              System.out.println(a+" appears before "+b);
         }
         else {
              System.out.println(b+" appears before "+a);
         }   
 }
}


// Sample Input 1:

// were

// apple

// Sample Output 1:

// The length of the first string is 4

// The length of the second string is 5

// The uppercase of the first string is WERE

// The uppercase of the second string is APPLE

// The concatenated string is wereapple

// apple appears before were