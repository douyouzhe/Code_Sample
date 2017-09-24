//DFS
// Method 1: Recursive DFS 
public static boolean DFS(Node root, int k){    
    if(root == null){
        return false;
    } else if (root.data == k){
        return true;
    } else {
        return DFS(root.left, k) || DFS(root.right, k);
    }
}   
// Method 2: DFS using stack 
    public static boolean DFS2(Node root, int k){
        if(root == null){
            return false;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(current.data == k){
                return true;    //Found the value!
            }
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){      // As we want to visit left 
            stack.push(current.left);  //child first, we must push this node last
        }
    }
    return false;                   // Not found