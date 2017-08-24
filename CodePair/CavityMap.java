/*
same as https://www.hackerrank.com/challenges/cavity-map/submissions/code/49970913
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */
    public static int[] asA(String s){
        int ret[] = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            ret[i] = Integer.parseInt( s.charAt(i)+"" );
        }
        return ret;
    }

    static String[] cavityMap(String[] arr) {
        String[] ret = new String[arr.length];
        int n = arr[0].length();
        int m[][] = new int[n][n];
        for(int i=0; i<n; i++){
           m[i] = asA(arr[i]); 
        }
        
        ret[0] = arr[0];
        /* print the remaining */
        for(int r=1; r<n-1; r++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[r].charAt(0));
            
            for(int c=1; c<n-1; c++){
                int t = m[r][c];
                if( t > m[r-1][c] && t > m[r+1][c] &&
                    t > m[r][c-1] && t > m[r][c+1] ){
                    sb.append("X");
                } else {
                    sb.append(t+"");
                }
            }
            sb.append(arr[r].charAt(n-1));
            ret[r] = sb.toString();
        }
        /* print the last line */
        if( n>1 )
            ret[n-1] = arr[n-1];   
            
        return ret;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine());
        String[] _arr = new String[_arr_size];
        String _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            try {
                _arr_item = in.nextLine();
            } catch (Exception e) {
                _arr_item = null;
            }
            _arr[_arr_i] = _arr_item;
        }
        
        res = cavityMap(_arr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
