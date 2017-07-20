//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char hr[] = {'h','a','c','k','e','r','r','a','n','k'};
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int index = 0;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c==hr[index]){
                    index++;
                }
                if(index == hr.length){ break; }
            }
            if( index == hr.length )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
