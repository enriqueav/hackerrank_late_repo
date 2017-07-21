import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s){
        // Complete this function
        HashSet<Character> h = new HashSet<Character>();
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( !h.contains(c) ){
                sum++;
                h.add(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
    }
}
