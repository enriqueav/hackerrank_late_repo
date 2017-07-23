import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] asA(String s){
        int ret[] = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            ret[i] = Integer.parseInt( s.charAt(i)+"" );
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        int m[][] = new int[n][n];
        for(int i=0; i<n; i++){
           m[i] = asA(grid[i]); 
        }
        System.out.println(grid[0]);
        /* print the remaining */
        for(int r=1; r<n-1; r++){
            System.out.print(grid[r].charAt(0));
            for(int c=1; c<n-1; c++){
                int t = m[r][c];
                if( t > m[r-1][c] && t > m[r+1][c] &&
                    t > m[r][c-1] && t > m[r][c+1] ){
                    System.out.print("X");
                } else {
                    System.out.print(t);
                }
            }
            System.out.println(grid[r].charAt(n-1));
        }
        /* print the last line */}
        if( n > 1 )
        System.out.println(grid[n-1]);
    }
}
