// I am getting good at this thing
// once more, it worked on the very first try
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.awt.Point;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Stack<Point> s = new Stack<Point>();
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        //int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int q = in.nextInt();
            int e;
            if( q == 1 ){
                e = in.nextInt();
                max = Math.max( max , e );
                s.push( new Point(e,max) );
            } else if( q == 2 ){
                Point d = s.pop();
                if( d.x == d.y ){
                    if( !s.empty() ){
                        max = s.peek().y;
                    } else {
                        max = 0;
                    }
                } 
            } else if( q == 3 ){
                System.out.println(s.peek().y);
            }
        }
    }
}
