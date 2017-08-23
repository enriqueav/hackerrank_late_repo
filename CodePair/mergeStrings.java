import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
 * Complete the function below.
 */

    static String mergeStrings(String a, String b) {
        int la = a.length();
        int lb = b.length();
        StringBuilder sb = new StringBuilder();
        for(int ia=0,ib=0; ia<a.length() || ib<b.length(); ia++,ib++){
            if( ia<a.length() ) sb.append( a.charAt(ia)+"" );
            if( ib<b.length() ) sb.append( b.charAt(ib)+"" );
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }
        
        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }
        
        res = mergeStrings(_a, _b);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
}
