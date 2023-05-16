package week1.day5_Concept_of_Classes_and_Objects.Customer_Class_With_Constructor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name = scn.nextLine();
        System.out.println("Enter the email");
        String email= scn.nextLine();
        System.out.println("Enter the type");
        String type = scn.nextLine();
        System.out.println("Enter the location");
        String address= scn.nextLine();
        Customer Customer= new Customer(name,email,type,address);
        Customer.displayDetails();
        }
}
