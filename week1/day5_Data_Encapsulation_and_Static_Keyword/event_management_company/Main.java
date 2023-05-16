package week1.day5_Data_Encapsulation_and_Static_Keyword.event_management_company;

import java.util.Scanner;

public class Main {
    public static void displayDetails(event e) {
        System.out.println("Inside Static Method");
        e.display();
    }

    public void displayEventDetails(event e) {
        System.out.println("Inside Non-Static Method");
        e.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        event event = new event();

        System.out.println("Enter the event name");
        event.setEventName(scanner.nextLine());

        System.out.println("Enter the hall name");
        event.setHallName(scanner.nextLine());

        System.out.println("Enter the start date(dd/MM/yyyy)");
        event.setStartDate(scanner.nextLine());

        System.out.println("Enter the end date(dd/MM/yyyy)");
        event.setEndDate(scanner.nextLine());

        System.out.println("Enter the no of people");
        event.setNoOfPeople(scanner.nextInt());

        Main main = new Main();
        displayDetails(event);
        main.displayEventDetails(event);
    }
}
