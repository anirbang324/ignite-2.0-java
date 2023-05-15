package week1.day4_Arrays_in_java;

import java.util.Scanner;

public class Stock_Span {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  p = new int[n];
        int[] st = new int[n];

        st[0] =1;
        p[0] = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            p[i] = sc.nextInt();
            int spnv =1;
            int j = i-1;

            while(j>=0 && p[i] >=p[j]){
                spnv = spnv + st[j];
                j = j-st[j];
            }
            st[i] = spnv;
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(st[i]);
        }
    }
}
