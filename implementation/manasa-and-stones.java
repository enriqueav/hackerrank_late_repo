// :/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int c=0; c<tc; c++){
            //each case
            int stones = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            if( a>b ){
                int t = a;
                a=b;
                b=t;
            }
            if( a==b ){
                System.out.println(a*(stones-1));
                continue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a*(stones-1));
            int count = a*(stones-1) + (b-a);
            while( count <= b*(stones-1) ){
                sb.append(" "+count);
                count += (b-a);
            }
            System.out.println(sb.toString());  
        }
    }
}
