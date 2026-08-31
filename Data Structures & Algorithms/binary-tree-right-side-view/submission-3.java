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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=q.size();i>0;i--){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.add(curr.left); 
                if(curr.right!=null) q.add(curr.right);
                if(i==1) res.add(curr.val);
            }
        }
        return res;
    }
}
