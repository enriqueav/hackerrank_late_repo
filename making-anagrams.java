import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static HashMap<Character,Integer> asHM(String s){
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( h.containsKey(c) ){
                h.put(c,h.get(c)+1);
            } else {
                h.put(c,1);
            }        
        }
        return h;
    }
    static int makingAnagrams(String s1, String s2){
        // Complete this function
        HashMap<Character,Integer> h1 = asHM(s1);
        HashMap<Character,Integer> h2 = asHM(s2);
        
        int suma = 0;
        for( Map.Entry<Character,Integer> entry : h1.entrySet()){
            if( !h2.containsKey( entry.getKey() ) ){
                suma += entry.getValue();
            } else {
                suma += Math.abs( entry.getValue() - h2.get( entry.getKey() ));
                h2.remove( entry.getKey() );
            }
        }
        for( Map.Entry<Character,Integer> entry : h2.entrySet()){
            // at this point all the duplicated values are removed from h2
            suma += entry.getValue();
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
