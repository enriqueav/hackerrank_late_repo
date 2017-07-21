//https://www.hackerrank.com/challenges/reduced-string/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if( !stack.empty() ){
                Character last = stack.peek();
                if( last.equals(c) ){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);   
        }
        
        if (!stack.empty()){
            StringBuilder sb = new StringBuilder();
            while(!stack.empty()){
                sb.append(stack.pop()+"");
            }
            return sb.reverse().toString();
        } else {
            return "Empty String";
        }      
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
