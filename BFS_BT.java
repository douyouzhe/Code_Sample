//BFS
public void breadth(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<BinaryTree.TreeNode>();
    if (root == null)
        return;
    queue.clear();
    queue.offer(root);
    while(!queue.isEmpty()){
        TreeNode node = queue.poll();
        System.out.print(node.element + " ");
        if(node.left != null) queue.offer(node.left);
        if(node.right != null) queue.offer(node.right);
    }
}
