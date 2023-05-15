package week1.day3_Break_and_Continue_Statements;

import java.util.Scanner;

public class do_while_and_break {
    public static void main(String[] args) {
        Scanner ani = new Scanner(System.in);
        int count = 0;
        while (ani.hasNext()) {  
            String id = ani.next();
            id=id.toLowerCase();
            if (id.length()!=4 || id.charAt(0)<'0' || id.charAt(0)>'9'
              || id.charAt(1)<'0' || id.charAt(1)>'9' || id.charAt(2)<'a'  || 
              id.charAt(2)>'z' || id.charAt(3)<'a' || id.charAt(3)>'z') {
                break;
            }
            String name = ani.next();
            String valid = ani.next();
            count++;
            if(valid.equals("no")) {
            }
        }
        System.out.println(count);
    }
}
