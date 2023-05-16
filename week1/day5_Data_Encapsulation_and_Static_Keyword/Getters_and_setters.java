package week1.day5_Data_Encapsulation_and_Static_Keyword;

import java.util.Scanner;

public class Getters_and_setters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Name:");
        String n = sc.nextLine();

        System.out.println("Enter Age:");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Country:");
        String c = sc.nextLine();
        Player Player = new Player(n, a, c);

        System.out.println("Player Details:");

        System.out.println("Name:" + Player.getName());
        System.out.println("Age:" + Player.getAge());
        System.out.println("Country:" + Player.getCountry());
    }
}


class Player {
    private String name;
    private Integer age;
    private String country;
    public Player(String name, Integer age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
 

    public void setAge(Integer age) {
        this.age = age;
    }

 public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   
}