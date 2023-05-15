package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Number_of_Distinct_Elements_in_an_Unsorted_Array {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);        
         int n=sc.nextInt();       
         int arr[]=new int[n];
         int c = 0;
         for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
         int i,j;
         for(i=0;i<n;i++)
         {
              for(j=0;j<i;j++)
                   if(arr[i]==arr[j])
                        break;
              if(i==j)
                c++;
         } 
         System.out.println(c);
     }
}
