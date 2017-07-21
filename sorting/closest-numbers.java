//https://www.hackerrank.com/challenges/closest-numbers/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        long minDiff = Long.MAX_VALUE;
        for(int i=0; i<(n-1); i++){
            if(Math.abs(a[i]-a[i+1]) < minDiff )
                minDiff = Math.abs(a[i]-a[i+1]);
        } 
        for(int i=0; i<(n-1); i++){
            if(Math.abs(a[i]-a[i+1]) == minDiff )
                System.out.print(a[i]+" "+a[i+1]+" ");
        } 
    }
}
