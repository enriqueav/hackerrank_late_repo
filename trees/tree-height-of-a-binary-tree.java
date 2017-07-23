	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        if( root == null )
            return -1;
        
        int left = height(root.left);
        int right = height(root.right);

        return Math.max( height(root.left)+1 , height(root.right)+1 );
    }
