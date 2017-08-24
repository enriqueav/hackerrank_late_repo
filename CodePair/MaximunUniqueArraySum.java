import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static int getMinimumUniqueSum(int[] arr) {
        int suma = 0;
        
        HashSet<Integer> s = new HashSet<Integer>();
        HashMap<Integer,Integer> dups = new HashMap<Integer,Integer>();
        for(int i:arr){
            if( !s.contains(i) ){
                s.add(i);
            } else {
                if( dups.containsKey(i) ){
                    dups.put( i, dups.get(i)+1 );
                } else {
                    dups.put( i, 2);
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            int este = arr[i];
            if( dups.containsKey(este) ){
                int tmp = este;
                while( s.contains(tmp) ){
                    tmp++;
                }
                s.add(tmp);
                arr[i]=tmp;
                dups.put( este, dups.get(este)-1 );
                if( dups.get(este) == 1 )
                    dups.remove(este);
            }
        }
        
        for(int i:arr) suma+=i;
        return suma;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }
        
        res = getMinimumUniqueSum(_arr);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
