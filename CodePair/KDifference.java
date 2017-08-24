import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static int kDifference(int[] a, int k) {
        int cuantos = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i:a){
            s.add(i);
        }
        for(int i:a){
            if( s.contains(i-k) ) cuantos++;
        }
        return cuantos;
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
        
        int _k;
        _k = Integer.parseInt(in.nextLine().trim());
        
        res = kDifference(_a, _k);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
