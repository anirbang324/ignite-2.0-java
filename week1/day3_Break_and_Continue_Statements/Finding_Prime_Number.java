package week1.day3_Break_and_Continue_Statements;

import java.util.Scanner;

public class Finding_Prime_Number {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<2){
			System.out.println("Not prime");
		}
	boolean isp = true;
	for(int i=2;i<=num/2;i++){
		if(num%i==0){
			isp = false;
			break;
		}
	}
	if (isp){
		System.out.println("Prime");
	}
	else{
		System.out.println("Not prime");
	}
	}

}
