package week1.day3_Break_and_Continue_Statements;

import java.util.Scanner;

public class star_pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    while(true){
        if(i >n)
            break;
        int j = 1;
        while(true){
            if(j > i)
                break;
            System.out.print("*");
            j++;
            continue;
        }
        System.out.println();
        i++;
    }
}
}
