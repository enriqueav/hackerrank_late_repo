import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String compress(String ns){
        long one = 0;
        for(int i=0; i<ns.length(); i++){
            int digit = Integer.parseInt( ns.charAt(i) + "" );
            one += digit;
        } 
        return one+"";
    }
    
    public static String superDigit(String n){
        if( n.length() == 1 )
            return n;
        else {
            return superDigit( compress(n) );
        }    
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String n = in.next();
        long k = in.nextLong();
        String one = compress(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++)
            sb.append(one);
        
        System.out.println( superDigit( sb.toString() ) );
    }
}
