import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static int similarity(String s1, String s2){
        int sum=0;
        for(int i=0; i<s1.length() && i<s2.length(); i++){
            if(s1.charAt(i)==s2.charAt(i))
                sum++;
            else
                break;
        }
        return sum;
    }
    
    static int similarities(String s){
        int sum = s.length();
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(0))
                sum += similarity(s,s.substring(i));
        }
        return sum;
    }

    static int[] stringSimilarity(String[] inputs) {
        int[] result = new int[inputs.length];
        for(int i=0; i<inputs.length; i++)
            result[i] = similarities(inputs[i]);
        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _inputs_size = 0;
        _inputs_size = Integer.parseInt(in.nextLine().trim());
        String[] _inputs = new String[_inputs_size];
        String _inputs_item;
        for(int _inputs_i = 0; _inputs_i < _inputs_size; _inputs_i++) {
            try {
                _inputs_item = in.nextLine();
            } catch (Exception e) {
                _inputs_item = null;
            }
            _inputs[_inputs_i] = _inputs_item;
        }
        
        res = stringSimilarity(_inputs);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
