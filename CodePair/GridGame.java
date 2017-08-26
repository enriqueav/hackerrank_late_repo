import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static long countX(String[] steps) {
        long minX=Long.MAX_VALUE;
        long minY=Long.MAX_VALUE;
        for(String s:steps){
            String[] parts = s.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            minX = Math.min(minX,x);
            minY = Math.min(minY,y);
        }
        return minX*minY;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;
        
        int _steps_size = 0;
        _steps_size = Integer.parseInt(in.nextLine().trim());
        String[] _steps = new String[_steps_size];
        String _steps_item;
        for(int _steps_i = 0; _steps_i < _steps_size; _steps_i++) {
            try {
                _steps_item = in.nextLine();
            } catch (Exception e) {
                _steps_item = null;
            }
            _steps[_steps_i] = _steps_item;
        }
        
        res = countX(_steps);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
