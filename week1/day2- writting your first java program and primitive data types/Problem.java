import java.util.Scanner;

public class Problem {
    public static void main(String[] args){    	     
        //Fill your code
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a double value");
        double d = sc.nextDouble();

        float f1 = (float)d;
        long l = (long)d;
        int a = (int)d;
        short s = (short)d;
        byte b = (byte)d;
        System.out.println("Double value  = "+d);
        System.out.println("Typecasted to float : Value  = "+f1);
        System.out.println("Typecasted to long : Value  = "+l);
        System.out.println("Typecasted to int : Value  = "+a);
        System.out.println("Typecasted to short : Value  = "+s);
        System.out.println("Typecasted to byte : Value  = "+b);
        
        
 }
}
