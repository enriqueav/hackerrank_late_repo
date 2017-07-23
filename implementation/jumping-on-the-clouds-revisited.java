// another instance where everthing worked on the first try
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int energy = 100;
        int j=0;
        do {
            energy--;
            j = (j+k)%n;
            if( c[j] == 1 )
                energy-=2;
        } while( j != 0);
        System.out.println(energy);
    }
}
