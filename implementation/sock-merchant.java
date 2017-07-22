/*
this is one of the happy cases where
at the first try it works
it passes all the testcases
with no syntax or logic problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int paris = 0;
        for(int i=0; i<n; i++){
            int t = ar[i];
            if( h.containsKey(t) ){
                int c = h.get(t);
                if( c == 1 ){
                    h.put(t,0);
                    paris++;
                } else {
                    h.put(t,1);
                }
            } else {
                h.put(t,1);
            }
        }
        return paris;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
