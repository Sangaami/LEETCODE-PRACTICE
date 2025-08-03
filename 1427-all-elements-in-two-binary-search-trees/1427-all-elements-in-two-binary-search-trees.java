/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> list = new LinkedList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        preOrder(root1);
        preOrder(root2);
        Collections.sort(list);
        return list; 
    }
    
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        list.add(root.val);
        preOrder(root.right);
    }
}