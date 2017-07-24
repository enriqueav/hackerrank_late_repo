import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=0; i<q; i++){
            long a = in.nextLong();
            long b = in.nextLong();
            
            long init = (long)Math.floor((long)Math.sqrt(a));
            long count = 0;
            while( init*init <= b ){
                if( init*init >= a ){
                    count++;
                }
                init++;
            }
            System.out.println(count);
        }
    }
}
