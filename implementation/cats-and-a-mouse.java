//cats-and-a-mouse
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            if( Math.abs(a-c) < Math.abs(b-c) ){
                System.out.println("Cat A");
            } else if( Math.abs(b-c) < Math.abs(a-c) ){
                System.out.println("Cat B");
            } else {
                System.out.println("Mouse C");
            }
        }
    }
}
