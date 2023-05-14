import java.util.Scanner;

public class Event_Details {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the event");
        String evtnm= sc.nextLine();

        System.out.println("Enter the type of the event");
        String evttyp= sc.nextLine();

        System.out.println("Enter the number of people expected");
       int p = sc.nextInt();

        System.out.println("Is it a paid entry? (Type Y or N)");
        char isp = sc.next().charAt(0);

        System.out.println("Enter the projected expenses (in lakhs) for this event");
        double dc = sc.nextDouble();

        System.out.println("Event Name :  "+evtnm);

        System.out.println("Event Type :  "+evttyp);

        System.out.println("Expected Count :  "+p);

        System.out.println("Paid Entry :  "+isp);

        System.out.println("Projected Expense:  "+String.format("%.1f",dc)+"L");

}
    
}
