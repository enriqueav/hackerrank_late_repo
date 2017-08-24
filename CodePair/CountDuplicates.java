import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static int countDuplicates(int[] numbers) {
        int sum = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> d = new HashSet<Integer>();
        for(int i:numbers){
            if( !s.contains(i) ){
                s.add(i);
            } else {
                if( !d.contains(i) ){
                    d.add(i);
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _numbers_size = Integer.parseInt(in.nextLine());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine());
            _numbers[_numbers_i] = _numbers_item;
        }
        
        res = countDuplicates(_numbers);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
