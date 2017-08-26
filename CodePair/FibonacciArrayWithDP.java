import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */
 
    static int fib(int n, int[] dp){
        int res = dp[n-1]+dp[n-2];
        dp[n]=res;
        return res;
    }

    static int[] fibonacci(int n) {
        int[] result = new int[n];
        result[0]=0;
        
        if( n == 1){
            return result;
        } else {
            result[1]=1;
            for(int i=2; i<n; i++){
                result[i] = fib(i,result);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _n;
        _n = Integer.parseInt(in.nextLine());
        
        res = fibonacci(_n);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
