import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int similarity(String uno, String dos){
        int simil = 0;
        for(int i=0; i<(Math.min(uno.length(),dos.length())); i++){
            if(uno.charAt(i)==dos.charAt(i))
                simil++;
            else
                break;
        }
        return simil;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        if( k > (s.length()+t.length()) ){
            System.out.println("Yes");
        } else {
            int simil = similarity(s,t);
            int diff = (s.length()-simil)+(t.length()-simil);
            if( diff>k ||(diff-k)%2 != 0 ){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } 
    }
}
