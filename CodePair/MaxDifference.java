import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static int maxDifference(int[] a) {
        int max = -1;
        int min = a[0];
        for(int i=1; i<a.length; i++){
            min = Math.min(min,a[i]);
            if( a[i] > min ) 
                max = Math.max(max,a[i]-min);
        }
        return max;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
        
        res = maxDifference(_a);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
