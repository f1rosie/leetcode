class binaryTreePreorderTraversal{
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while( cur != null || !stack.isEmpty()){
      while(cur != null){
        res.add(cur.val);
        stack.push(cur);
        cur = cur.left;
      }
      cur = stack.pop();
      cur = cur.right;
    }
    return res;
  }
}
