import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int a1 = 0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            a1 += h1[h1_i];
        }
        int h2[] = new int[n2];
        int a2 = 0;
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            a2 += h2[h2_i];
        }
        int h3[] = new int[n3];
        int a3 = 0;
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            a3 += h3[h3_i];
        }
        int i1=0; int i2=0; int i3=0;
        while( a1!=a2 || a1!=a3 || a2!=a3 ){
            if( a1 >= a2 && a1 >= a3 ){
                a1 -= h1[i1];
                i1++;
            } else if( a2 >= a1 && a2 >= a3 ){
                a2 -= h2[i2];
                i2++;
            } else if( a3 >= a1 && a3 >= a2 ){
                a3 -= h3[i3];
                i3++;
            }
        }
        System.out.println(a1);
    }
}
