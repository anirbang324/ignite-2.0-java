package week1.day4_String_Operations;

import java.io.IOException;
import java.util.Scanner;

public class Converting_Text_to_SMS_Language {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String ani = sc.nextLine();
        ani= ani.replaceAll("yes", "s");
        ani = ani.replaceAll("you", "u");
        ani = ani.replaceAll("today", "2day");
        ani = ani.replaceAll("why", "y");
        System.out.println(ani);


    }
}


// Sample Input 1:

// where were you yesterday?

// Sample Output 1:

// where were u sterday?