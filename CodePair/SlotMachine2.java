import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static int slotGame(String[] spins) {
        int[][] v = new int[spins.length][spins[0].length()];
        int index = 0;
        for(String s : spins ){
            for(int i=0; i<v[index].length; i++)
                v[index][i] = Integer.parseInt(s.charAt(i)+"");
            
            index++;
        }
        for(int r=0; r<v.length; r++){
            Arrays.sort(v[r]);
        }
        int counter = 0;
        for(int c=0; c<v[0].length; c++){
            int max = 1;
            for(int r=0; r<v.length; r++){
                max = Math.max(max,v[r][c]);
            }
            counter += max;
        }        
        return counter;
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

        int res;
        int spins_size = 0;
        spins_size = Integer.parseInt(in.nextLine().trim());

        String[] spins = new String[spins_size];
        for(int i = 0; i < spins_size; i++) {
            String spins_item;
            try {
                spins_item = in.nextLine();
            } catch (Exception e) {
                spins_item = null;
            }
            spins[i] = spins_item;
        }

        res = slotGame(spins);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
