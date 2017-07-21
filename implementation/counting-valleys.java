import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        String s = in.next();
        int level = 0;
        int valleys = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( c == 'U' ){
                level++;
            } else if( c == 'D' ){
                if(level==0)
                    valleys++;
                
                level--;
            } else {
                // no way ho-se
            }
        }
        System.out.println(valleys);
    }
}
