import java.util.*; 

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
 
class inorderTrav {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList<>(); 
      inorder(root, ans); 
      return ans; 
    }

      public void inorder(TreeNode root, List<Integer> ans) {
        if (root != null) {
          inorder(root.left, ans);
          System.out.println(root.val); 
          ans.add(root.val); 
          inorder(root.right, ans); 
        }
      }
}
