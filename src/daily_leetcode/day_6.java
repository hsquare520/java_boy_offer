package daily_leetcode;

import java.util.ArrayList;
import java.util.List;

//给定一个二叉树，原地将它展开为一个单链表
//例如，给定二叉树
//    1
//   / \
//  2   5
// / \   \
//3   4   6
//将其展开为：
//1
// \
//  2
//   \
//    3
//     \
//      4
//       \
//        5
//         \
//          6
//链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
public class day_6 {
    public static void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode pre = list.get(i - 1), cur = list.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }

    public static void preorder(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    ;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}