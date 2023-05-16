package week1.day5_Concept_of_Classes_and_Objects.Classes_and_Attributes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){    	     
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the country name");
        String name= scn.nextLine();
        System.out.println("Enter the country code");
        String countrycode= scn.nextLine();
        System.out.println("Enter the isd code");
        String isd= scn.nextLine();
        Country Country= new Country(name,countrycode,isd);
        Country.display();
        }
}
