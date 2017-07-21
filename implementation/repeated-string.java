import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long asInS = 0;
        long asInFirstN = 0;
        long remaining = (long)(n%s.length());
        long times = (long)Math.floor( n/s.length() );
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i)=='a' ){ 
                asInS++;
                if( i<remaining )
                    asInFirstN++;
            }
        }
        System.out.println( (times*asInS)+asInFirstN );
    }
}
