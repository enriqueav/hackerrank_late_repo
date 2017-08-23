/*
find if a number is power of 2
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
    static int isPow2(int num){
        int tmp = 1;
        while( tmp <= num ){
            if( tmp == num ) return 1;
            tmp <<= 1;
        }
        return 0;
    }
    static int[] isPowerOf2(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = isPow2(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        int nums_size = 0;
        nums_size = Integer.parseInt(in.nextLine().trim());

        int[] nums = new int[nums_size];
        for(int i = 0; i < nums_size; i++) {
            int nums_item;
            nums_item = Integer.parseInt(in.nextLine().trim());
            nums[i] = nums_item;
        }

        res = isPowerOf2(nums);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
