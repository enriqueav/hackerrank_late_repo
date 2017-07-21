/*
I must me proud of myself, this workd on the first try,
no syntax or logic error
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        // Complete this function
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( !h.containsKey(c) )
                h.put(c,1);
            else
                h.put(c,h.get(c)+1);
        }
        boolean singleUneven = false;
        for( Map.Entry<Character,Integer> entry : h.entrySet()){
            if( entry.getValue() % 2 == 1 ){
                if( singleUneven )
                    return "NO";
                else {
                    singleUneven = true;
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
