// translated from the previous version, made in Ruby (Ruby, Ruby, Ruby) <3
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void pushToReversed(Stack<Integer> r,Stack<Integer> g){
        while( !g.empty() ){
            r.push(g.pop());
        }       
    }

    public static void pushToGood(Stack<Integer> r,Stack<Integer> g){
        while( !r.empty() ){
            g.push(r.pop());
        }       
    }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Stack<Integer> reversed = new Stack<Integer>();
        Stack<Integer> good = new Stack<Integer>();
        for(int i=0; i<q; i++){
            int o = in.nextInt();
            int e;
            if( o == 1 ){
                e = in.nextInt();
                reversed.push(e);
            } else if( o == 2 ){
               if ( good.empty() ){
                    pushToGood(reversed,good);
               }
               good.pop();                  
            } else if( o == 3 ){
                if( good.empty() ){
                    pushToGood(reversed,good);
                }
                System.out.println(good.peek());                
            }
        }
    }
}
