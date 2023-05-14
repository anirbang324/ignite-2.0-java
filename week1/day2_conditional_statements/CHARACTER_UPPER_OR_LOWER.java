package week1.day2_conditional_statements;

import java.util.Scanner;

public class CHARACTER_UPPER_OR_LOWER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(Character.isUpperCase(c)==true){
            System.out.println(c+" is uppercase letter");
        }
        else if(Character.isLowerCase(c)==true){
             System.out.println(c+" is lowercase letter");
        }   
        else{
            System.out.println(c+" is neither an uppercase or lowercase letter");
        }
     }
}
