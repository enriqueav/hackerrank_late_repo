import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int getIndex(Integer[] arr, int initial, int k){
        int first = arr[initial];
        int provisional = arr[initial];
        
        for(int i=initial; i<arr.length; i++){
            int current = arr[i];
            if( (current - first) > k )
                return provisional;   
            else
                provisional = current;            
        }
        return first;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
            hs.add(x[x_i]);
        }
        Integer arr[] = hs.toArray(new Integer[hs.size()]);
        Arrays.sort(arr);
        int antennas = 0;
        int last = 0;
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            if( (current-last) > k || last==0 )
            {
                last = getIndex(arr,i,k);
                antennas++;
            }
        }
        System.out.println(antennas);
    }
}
