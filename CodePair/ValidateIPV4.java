/*
string.split("takes a regex here, hence . is \\.");
*/
import java.util.regex.*;
import java.util.Scanner; 

class MyRegex extends Solution {
    private static String pattern = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";
    public String ip;
    private boolean matches = false;
    
    public MyRegex(String iP) { 
        // Write your code here
        if( iP.matches(pattern) ){
            String[] parts = iP.split("\\.");
            boolean allValid = true;
            for( String n : parts ){
                int number = Integer.parseInt(n);
                if( number > 255 ){
                    allValid = false;
                }
            }
            this.matches = allValid;
        } 
    }
    
    public boolean isMatch() {
        // Write your code here
        return this.matches;
    }
}

class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String iP = in.next();
            MyRegex mr = new MyRegex(iP);
			System.out.println(mr.isMatch());
		}
        in.close();
	}
}
