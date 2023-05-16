package week1.day5_Concept_of_Classes_and_Objects.customer_address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){    	     
        Scanner sc = new Scanner(System.in);
        Address a = new Address();

        System.out.println("Enter Customer Address");
         System.out.println("Enter the street");
         String street = sc.nextLine();
         a.street = street;
         System.out.println("Enter the city");
         String city = sc.nextLine();
         a.city = city;

         System.out.println("Enter the pincode");
         int pincode = Integer.parseInt(sc.nextLine());
         a.pincode = pincode;
         System.out.println("Enter the country");
         String country = sc.nextLine();
         a.country = country;

         a.displayAddress();

 }
}
