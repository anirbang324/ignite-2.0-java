package week1.day2_Operators;

import java.util.Scanner;

public class Total_Expenses_for_the_Event {
    public static void main(String[] args) throws Exception{ 
        //		Fill your code
                Scanner ani = new Scanner(System.in);
                double be,te,fe,le;
                double total,bep,tep,fep,lep;
                System.out.println("Enter branding expenses");
                be = ani.nextDouble();
                System.out.println("Enter travel expenses");
                te = ani.nextDouble();
                System.out.println("Enter food expenses");
                fe = ani.nextDouble();
                System.out.println("Enter logistics expenses");
                le = ani.nextDouble();
                total = be+te+fe+le;
                bep = (be/total)*100;
                tep = (te/total)*100;
                fep = (fe/total)*100;
                lep = (le/total)*100;
                System.out.println("Total expenses: Rs."+String.format("%.2f",total));
                System.out.println("Branding expenses percentage: "+String.format("%.2f",bep)+"%");
                System.out.println("Travel expenses percentage: "+String.format("%.2f",tep)+"%");
                System.out.println("Food expenses percentage: "+String.format("%.2f",fep)+"%");
                System.out.println("Logistics expenses percentage: "+String.format("%.2f",lep)+"%");
            }
    
}
