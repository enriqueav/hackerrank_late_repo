import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        // Complete this function
        if( s.length()%2 == 1 ) return -1;
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( i<s.length()/2 ){
                if( h.containsKey(c) ){
                    h.put(c,h.get(c)+1);
                } else {
                    h.put(c,1);
                }
            } else {
                if( h.containsKey(c) ){
                    h.put(c,h.get(c)-1);
                } else {
                    h.put(c,-1);
                }                
            }
        }
        int sum = 0;
        for( Map.Entry<Character,Integer> entry : h.entrySet()){
            sum += Math.abs( entry.getValue() );
        }
        return sum/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
