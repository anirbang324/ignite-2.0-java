package week1.day2_Operators;
import java.util.Scanner;
public class Help_the_Mess_Owner {
    public static void main(String[] args){    	     
        //Fill your code
        Scanner ani = new Scanner(System.in);
        System.out.println("Cost of item:");
        int n = ani.nextInt();
        System.out.println("Number of items:");
        int m = ani.nextInt();
        int res = m*n;
        System.out.println("Total cost is Rs."+res);
    }
}
