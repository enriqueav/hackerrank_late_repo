import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        StringBuilder sb = new StringBuilder();
       
        for( int i=0; i<s.length(); i++ ){
            char c = s.charAt(i);
            int ascii = (int)c;
           
            char newChar = c;
            if( ascii>=97 && ascii<=122 ){
                int diff = ascii-97;
                int newRow = (diff+k)%26;
                int newInt = newRow+97;
                newChar = (char)newInt;
            }
            if( ascii>=65 && ascii<=90 ){
                int diff = ascii-65;
                int newRow = (diff+k)%26;
                int newInt = newRow+65;
                newChar = (char)newInt;
            }
            sb.append(newChar+"");
        }
        System.out.println(sb.toString());
    }
}
