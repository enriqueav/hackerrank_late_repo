/*
this is not the optimal solution,
but,
due to the limited time and the restriction 
X,Y <= 2000
it works
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

    static String[] ReduceFraction(String[] fractions) {
        String[] result = new String[fractions.length];
        int index = 0;
        for( String f : fractions ){
            String[] parts = f.split("/");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            
            int maxDivider = Math.min(x,y);
            for(; maxDivider>=1; maxDivider--){
                if( x%maxDivider == 0 && y%maxDivider == 0 ) break;
            }
            result[index] = (x/maxDivider)+"/"+(y/maxDivider);
            index++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        
        int _fractions_size = 0;
        _fractions_size = Integer.parseInt(in.nextLine());
        String[] _fractions = new String[_fractions_size];
        String _fractions_item;
        for(int _fractions_i = 0; _fractions_i < _fractions_size; _fractions_i++) {
            try {
                _fractions_item = in.nextLine();
            } catch (Exception e) {
                _fractions_item = null;
            }
            _fractions[_fractions_i] = _fractions_item;
        }
        
        res = ReduceFraction(_fractions);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
