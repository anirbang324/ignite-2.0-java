package week1.day2_conditional_statements;

import java.util.Scanner;

public class DIVISIBLE_BY_2_OR_3 {
        public static void main(String[] args) {
            Scanner ani = new Scanner(System.in);
    
            int n = ani.nextInt();
            if(n%2==0 || n%3==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }  
        }
    }
