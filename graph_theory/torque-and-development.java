/*
This is translated from my ruby version,
the ruby version was actually made for something else
and addapted to this, so it may not be optimal
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static class Node
    {
        public HashSet<Integer> connections;
        public Node(){
            connections = new HashSet<Integer>();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long clib = in.nextLong();
            long croad = in.nextLong();
            long result = 0;
            ArrayList<Node> map = new ArrayList<Node>(); 
            for(int i=0; i<n; i++){
                map.add(new Node());
            }
            
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt(); 
                map.get(city_1-1).connections.add(city_2-1);
                map.get(city_2-1).connections.add(city_1-1);
            }
            
            if( croad > clib ){
                System.out.println( n*clib );
                continue;
            }
            
            HashSet<Node> added = new HashSet<Node>();
            ArrayList<Integer> groups = new ArrayList<Integer>();
            for( Node city : map ){
                if( added.contains(city) ){
                    continue;
                }
                int initial = added.size();
                
                // tovisit is the array holding the nodes that I will visit
                Stack<Node> tovisit = new Stack<Node>();
                tovisit.add(city);
                
                // expand this group, visit connected nodes searching for each
                // of their connections
                // ignoring the nodes already processed (included in processed)
                while( tovisit.size() > 0 ){
                    Node visited = tovisit.pop();
                    for( int c : visited.connections ){
                        if( !added.contains(map.get(c)) ){
                            tovisit.push( map.get(c) );
                            added.add( map.get(c) );
                        }
                    }
                } 
                 int alFinal = added.size();
                 groups.add(alFinal-initial); 
            }
            //puts "groups = #{groups}"
            //System.out.println( "groups has "+groups);
            long sum = 0;
            for( int g : groups){
                sum += clib;
                if(g > 1)
                    sum += croad*(g-1);
                
            }
            System.out.println( sum );
        }
    }
}
