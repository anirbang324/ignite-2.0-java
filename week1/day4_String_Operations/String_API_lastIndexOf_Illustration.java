package week1.day4_String_Operations;

import java.util.Scanner;

public class String_API_lastIndexOf_Illustration {
    public static void main(String[] args) {
        Scanner ani= new Scanner(System.in);
        System.out.println("Enter the string");
        String str1= ani.nextLine();
        System.out.println("Enter the string to be searched");
        String search= ani.nextLine();
        System.out.println("The index of last occurence of \""+search+" \" is "+str1.lastIndexOf(search,str1.length()-1));
        System.out.println("Enter the index limit");
        int indexlimit= ani.nextInt();
        System.out.println("First occurence of \""+search+"\" from "+indexlimit+"th index backwards is "+str1.lastIndexOf(search,indexlimit));
         }
}


// Sample Input and Output:

// Enter the string

// Amphisoft Technologies is a product company

// Enter the string to be searched

// is

// The index of last occurence of "is" is 23

// Enter the index limit

// 20

// First occurence of "is" from 20th index backwards is 4