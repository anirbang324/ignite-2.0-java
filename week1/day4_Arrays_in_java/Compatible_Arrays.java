package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Compatible_Arrays {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];

        for(int i=0;i<n;i++){
            ar1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            ar2[i] = sc.nextInt();
        }

        int res = 1;
        for(int i=0;i<n;i++){
            if(ar1[i]<ar2[i]){
                res = res+1;
                break;
            }
        }

        if(res == 1){
            System.out.println("Compatible");
        }
        else{
            System.out.println("Incompatible");
        }
    }
}
