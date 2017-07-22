import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int m = in.nextInt();
            int n = in.nextInt();
            int p[] = new int[n];
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int f=0; f<n; f++){
                p[f] = in.nextInt();
                if( h.containsKey(m-p[f]) ){
                    System.out.println(h.get(m-p[f])+" "+(f+1));
                    continue;
                }
                h.put(p[f],f+1);          
            }        
        }
    }
}
