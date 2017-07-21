// i don't like this
// but it works
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        // Complete this function
        int result = -1;
        for(int i=0,f=s.length()-1; i<f; i++,f--){
            char ci = s.charAt(i);
            char cf = s.charAt(f);
            if( ci!=cf ){
                if( (i+1)==f ) return i;
                if( ci == s.charAt(f-1) && cf == s.charAt(i+1) ){
                    if( s.charAt(i+2)==s.charAt(f-1) ) return i;
                }
                if( ci == s.charAt(f-1) ) return f;
                if( cf == s.charAt(i+1) ) return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
