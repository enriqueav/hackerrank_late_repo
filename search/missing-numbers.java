// this surely can be done with less effort
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int N[] = new int[n];
        HashMap<Integer,Integer> hn = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            N[i] = in.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int m = in.nextInt();
        int M[] = new int[m];
        for(int i=0; i<m; i++){
            M[i] = in.nextInt();
            if( hm.containsKey(M[i]) ){
                hm.put(M[i],hm.get(M[i])+1);
            } else {
                hm.put(M[i],1); 
            }
        }
        for(int i=0; i<n; i++){
            if( hm.containsKey(N[i])){
                hm.put(N[i],hm.get(N[i])-1);
                if( hm.get(N[i]) == 0 )
                    hm.remove(N[i]);
            }
        }
        int res[] = new int[hm.size()];
        int index = 0;
        for( Map.Entry<Integer,Integer> entry : hm.entrySet() ){
            res[index] = entry.getKey();
            index++;
        }
        Arrays.sort(res);
        for( int i : res ){
            System.out.print(i+" ");
        }
    }
}
