package week1.day2_conditional_statements;

import java.util.Scanner;

public class Grade_Calculation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int n = sc.nextInt();
		if(n<0 || n>100){
			System.out.println("Invalid Input");
		}
		else if(n==100){
			System.out.println("The student obtained a S grade");
		}
		else if(n>=90 && n<100){
			System.out.println("The student obtained a A grade");
		}
		else if(n>=80 && n<90){
			System.out.println("The student obtained a B grade");
		}
		else if(n>=70 && n<80){
			System.out.println("The student obtained a C grade");
		}
		else if(n>=60 && n<70){
			System.out.println("The student obtained a D grade");
		}
		else if(n>=50 && n<60){
			System.out.println("The student obtained a  E grade");
		}
		else if(n<50){
			System.out.println("The student obtained a F grade");
		}
	}
}
