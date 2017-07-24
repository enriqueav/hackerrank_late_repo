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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=0; i<q; i++){
            int n = in.nextInt();
            int e = in.nextInt();

            ArrayList<Node> map = new ArrayList<Node>(); 
            for(int c=0; c<n; c++){
                map.add(new Node());
            }
            
            for(int a1 = 0; a1<e; a1++){
                int n1 = in.nextInt();
                int n2 = in.nextInt(); 
                map.get(n1-1).connections.add(n2-1);
                map.get(n2-1).connections.add(n1-1);
            }
            int s = in.nextInt();
            // up to this point, we have created the graph
                HashMap<Node,Integer> added = new HashMap<Node,Integer>();
                // tovisit is the array holding the nodes that I will visit
                Stack<Node> tovisit = new Stack<Node>();
                // add the starting point 's'
                tovisit.add(map.get(s-1));
                
                // expand this group, visit connected nodes searching for each
                // of their connections
                // ignoring the nodes already processed (included in processed)
                added.put(map.get(s-1),0);
            
                while( tovisit.size() > 0 ){          
                    ArrayList<Node> nextLevel = new ArrayList<Node>();
                    
                    while( tovisit.size() > 0 ){
                        Node v = tovisit.pop();
                        int thisLevel = added.get(v);
                        for( int c : v.connections ){
                            Node connected = map.get(c);
                          if( !added.containsKey(connected) ){
                            added.put( connected , thisLevel+1 );
                            nextLevel.add( connected );
                          }  
                        }
                    }
                    for( Node nodo : nextLevel ){
                        tovisit.push(nodo);
                    }                
                } 
                //System.out.println("the size of added = "+added.size());
                for(int f=0; f<n; f++){
                    if( f !=(s-1) ){
                        if( added.containsKey(map.get(f)) ){
                            System.out.print( (added.get(map.get(f))*6)+" ");
                        } else {
                            System.out.print("-1 ");   
                        }
                    }
                }
                System.out.println(); 
        }
    }
}
