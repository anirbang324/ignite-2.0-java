package week1.day2_Operators;

import java.util.Scanner;

public class Trade_Fair {
        public static void main(String[] args){    	     
               //Fill your code
            Scanner ani = new Scanner(System.in);
           
             int ppl,d1,d2,d3;
              System.out.println("Enter the total number of people");
             ppl = ani.nextInt();
            d1 = (2*ppl)/7;
            d2 = d1*2;
            d3 = d1/2;
            System.out.println("Number of attendees on day 1 : "+d1);
            System.out.println("Number of attendees on day 2 : "+d2);
            System.out.println("Number of attendees on day 3 : "+d3);
    
        }
}
