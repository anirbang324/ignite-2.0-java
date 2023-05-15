package week1.day4_String_basics;

import java.util.Scanner;

public class equals_and_equalsIgnoreCase {
    public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Address 1:");
		String str1=sc.nextLine();
		System.out.println("Address 2:");
		String str2=sc.nextLine();
		if(str1.equals(str2))
		{
             System.out.println("RED");
		}
		else if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("BLUE");
		}
		else if(str1.replaceAll("\\s", "").equals(str2.replaceAll("\\s", "")))
			{
			System.out.println("YELLOW");
		}
		else
			{
			System.out.println("GREEN");
		}
	}
}
