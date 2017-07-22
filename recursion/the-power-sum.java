import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int answer(int target, int power, int begin)
    {
        int thisValue = (int)Math.pow(begin, power);
        if(target < thisValue) return 0;
        else if(target == thisValue) return 1;
        else{
            int solution = 0;
            for(int i = begin+1; target >= (int)Math.pow(i, power); i++){
                solution += answer(target - thisValue, power, i);
            }
            return solution;
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(answer(x,n,0));
        
    }
}
