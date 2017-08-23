import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */
    static int search(int[] nums,int goal, int ini, int fin){
        if( ini>fin ) return ini;
        int mid = ini + (fin-ini)/2;
      
        if (nums[mid] == goal)
            return search(nums, goal, mid+1, fin);
        else if (nums[mid] > goal)
            return search(nums, goal, ini, mid-1);
        else
            return search(nums, goal, mid+1, fin);
    }
    

    static int[] counts(int[] nums, int[] maxes) {
        int[] result = new int[maxes.length];
        Arrays.sort(nums);
        
        for(int i=0; i<maxes.length; i++){
            int max = maxes[i];
            int index = search(nums,max,0,nums.length-1);
            
            result[i] = index; //TODO: what transformation?
        }
        
        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }
        
        
        int _maxes_size = 0;
        _maxes_size = Integer.parseInt(in.nextLine().trim());
        int[] _maxes = new int[_maxes_size];
        int _maxes_item;
        for(int _maxes_i = 0; _maxes_i < _maxes_size; _maxes_i++) {
            _maxes_item = Integer.parseInt(in.nextLine().trim());
            _maxes[_maxes_i] = _maxes_item;
        }
        
        res = counts(_nums, _maxes);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
