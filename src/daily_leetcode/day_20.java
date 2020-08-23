package daily_leetcode;
//给定一个二叉树，判断它是否是高度平衡的二叉树。
//
//本题中，一棵高度平衡二叉树定义为：
//
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
public class day_20 {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        return Math.abs(help(root.left)-help(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int help (TreeNode root){
        if (root==null)
            return 0;
        return Math.max(help(root.left),help(root.right))+1;
    }

}
