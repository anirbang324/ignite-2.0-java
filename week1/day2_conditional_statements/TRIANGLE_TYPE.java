package week1.day2_conditional_statements;

import java.util.Scanner;

public class TRIANGLE_TYPE {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
     int s1 = scn.nextInt();
        int s2 = scn.nextInt();
        int s3 = scn.nextInt();

        if (s1 + s2 + s3== 180) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("Triangle is equilateral");
            } else if (s1 == 90 || s2 == 90 || s3 == 90) {
                if (s1 == s2 || s2 == s3 || s3 == s1) {
                    System.out.println("Triangle is right isosceles");
                } else {
                    System.out.println("Triangle is right");
                }
            } else if (s1 == s2 || s2 == s3|| s3 == s1) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is not special");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }
}
