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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return count;
    }
    private int[] traverse(TreeNode node){
        if(node == null) return new int[] {0, 0};

        int[] left = traverse(node.left);
        int[] right = traverse(node.right);

        int sum = left[0] + right[0] + node.val;
        int number = left[1] + right[1] + 1;

        if(sum / number == node.val) count++;

        return new int[] {sum, number};
    }

}