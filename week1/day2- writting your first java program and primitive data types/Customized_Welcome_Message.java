import java.util.Scanner;

public class Customized_Welcome_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.next();
        System.out.println("Hello "+s+"!"+"  Welcome to Event Management System.");
        }
}
