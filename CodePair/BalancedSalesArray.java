/*
find an index where left side sum equals right side sum
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

    static int balancedSum(int[] sales) {
        int[] lefts  = new int[sales.length];
        int[] rights = new int[sales.length];
        int sumL = 0;
        int sumR = 0;
        int size = sales.length;
        for(int i=0; i<sales.length; i++){
            sumL += sales[i];
            lefts[i] = sumL;
            sumR += sales[size-1-i];
            rights[size-1-i] = sumR;
        }
        int index = 0;
        for(int i=1; i<sales.length-1; i++){
            if( lefts[i-1] == rights[i+1] )
                return i;
        }
        return index;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _sales_size = 0;
        _sales_size = Integer.parseInt(in.nextLine().trim());
        int[] _sales = new int[_sales_size];
        int _sales_item;
        for(int _sales_i = 0; _sales_i < _sales_size; _sales_i++) {
            _sales_item = Integer.parseInt(in.nextLine().trim());
            _sales[_sales_i] = _sales_item;
        }
        
        res = balancedSum(_sales);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
