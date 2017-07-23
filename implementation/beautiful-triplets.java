// may be too naive
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
        int d = in.nextInt();
        int a[] = new int[n];
        //dothedance
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            h.add(a[i]);
        }
        int cuantos = 0;
        for(int i=0; i<n; i++){
            int este = a[i];
            if( h.contains(este+d) && h.contains(este+d*2) )
                cuantos++;
        }
        System.out.println(cuantos);
    }
}
