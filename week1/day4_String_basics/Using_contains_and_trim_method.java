package week1.day4_String_basics;

import java.util.Scanner;

public class Using_contains_and_trim_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text from the document");
        String t = sc.nextLine().trim();
        System.out.println("Enter the string to be found in the data");
        String f = sc.nextLine().trim();
        
        if(t.contains(f)){
            System.out.println("String is found in the document");
        }
        else{
            System.out.println("String is not found in the document");
        }
     }
}


// Sample Input and output 1:

// Enter the text from the document
// One fine morning, a minister from Emperor Akbar's court had gathered in the assembly hall. He informed the Emperor that all his valuables had been stolen by a thief the previous night.
// Enter the string to be found in the data
//     stolen   
// String is found in the document

