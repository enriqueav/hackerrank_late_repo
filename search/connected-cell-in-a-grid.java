import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.awt.Point;

public class Solution {

     
    public static HashSet<Point> findAdjacent( int[][] mat,int i,int j ){
        HashSet<Point> adjacent =  new HashSet<Point>();
        for( int u=Math.max(0,i-1); u<=Math.min(i+1,mat.length-1); u++){
            for( int d=Math.max(0,j-1); d<=Math.min(j+1,mat[0].length-1); d++){
                if( mat[u][d]==1 && (i!=u || j!=d) )
                    adjacent.add(new Point(u,d));
            }
        } 
        return adjacent;
    }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mat[][] = new int[n][m];
        int maxi = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if( mat[i][j] == 1){
                    HashSet<Point> region = new HashSet<Point>();
                    region.add( new Point(i,j) );
                    Stack<Point> tovisit = new Stack<Point>();
                    tovisit.push( new Point(i,j) );
                    while( !tovisit.empty() ){
                        HashSet<Point> toadd = new HashSet<Point>();
                        while( !tovisit.empty() ){
                            Point point = tovisit.pop();
                            toadd.addAll(  findAdjacent( mat,point.x,point.y ) );
                        }
                        for( Point val : toadd ){
                            if( !tovisit.contains(val) && !region.contains(val) )  
                                tovisit.push(val);
                
                            region.add(val);
                            mat[val.x][val.y]=2; // mark as visited
                        }
                    }
                    maxi = Math.max(maxi,region.size());
                }
            }
        }
        System.out.println(maxi);
    }
}
