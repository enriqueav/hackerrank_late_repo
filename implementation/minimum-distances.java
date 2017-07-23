import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int min = n;
        for(int i=0; i<n; i++){
            int c = A[i];
            if( h.containsKey(c) ){
                int previous = h.get(c);
                min = Math.min(min,i-previous);
            }
            h.put(c,i);
        }
        if( min == n ) min = -1;
        System.out.println(min);
    }
}
