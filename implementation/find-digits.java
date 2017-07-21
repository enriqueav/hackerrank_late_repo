import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String s = n+"";
            int suma = 0;
            for(int i=0; i<s.length(); i++){
                int d = Integer.parseInt(s.charAt(i)+"");
                if( d>0 ){
                    if( n%d == 0 )
                        suma++;
                } 
            }
            System.out.println(suma);
        }
    }
}
