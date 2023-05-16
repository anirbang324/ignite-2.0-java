package week1.day5_Data_Encapsulation_and_Static_Keyword.display_item_types;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item type name");
		String name = sc.nextLine();

		System.out.println("Enter the cost per day");
		double costPerDay  = sc.nextDouble();

		System.out.println("Enter the deposit");
		double deposit = sc.nextDouble();

		itemtype it = new itemtype();
		it.setName(name);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);

		it.display();

	}
}
