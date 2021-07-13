
// class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//          this.right = right;
//       }
//   }
 
class balancedBTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true; 
        int left = maxDepth(root.left); 
        int right = maxDepth(root.right); 
        
        if (Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) return true; 
      return false; 
    }
  
    public int maxDepth(TreeNode root) {
        if (root == null) {
          return 0; 
        }
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));  
    }
}