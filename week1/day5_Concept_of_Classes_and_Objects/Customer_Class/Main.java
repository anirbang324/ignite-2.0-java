package week1.day5_Concept_of_Classes_and_Objects.Customer_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n, m, t, l;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        n = ip.nextLine();
        System.out.println("Enter the email");
        m = ip.nextLine();
        System.out.println("Enter the type");
        t = ip.nextLine();
        System.out.println("Enter the location");
        l = ip.nextLine();
        Customer c = new Customer(n, m, t, l);
        c.displayDetails();
    }
}
