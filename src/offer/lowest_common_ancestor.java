package offer;

public class lowest_common_ancestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while (root!=null){
            if (root.val<p.val&&root.val<q.val){
                root=root.right;
            }else if (root.val>p.val&&root.val>q.val){
                root=root.left;
            }
            else break;
        }
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}