// this can be done in linear time, right?
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
        System.out.println( a[(int)Math.ceil(n/2)] );
    }
}
