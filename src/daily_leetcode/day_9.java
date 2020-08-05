package daily_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class day_9 {
    //你是一个专业的小偷，计划偷窃沿街的房屋。
// 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
// 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
//输入：[1,2,3,1]
//输出：4
//解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。
//输入：[2,7,9,3,1]
//输出：12
//解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
//链接：https://leetcode-cn.com/problems/house-robber
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 3, 4, 5, 6, 7, 8, 5, 4, 3, 9,};
        System.out.println(rob1(nums));
        System.out.println(rob2(nums));
    }

    public static int rob1(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }


//    你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。
//    这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。
//    同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

    //输入: [2,3,2]
//输出: 3
//解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
//示例 2:
//
//输入: [1,2,3,1]
//输出: 4
//解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
//     偷窃到的最高金额 = 1 + 3 = 4 。
//链接：https://leetcode-cn.com/problems/house-robber-ii
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public static int rob2(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        return Math.max(rob1(Arrays.copyOfRange(nums, 0, n - 1)), rob1(Arrays.copyOfRange(nums, 1, n)));
    }

    //在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。
// 这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。
// 一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
// 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
//
//输入: [3,2,3,null,3,null,1]
//
//     3
//    / \
//   2   3
//    \   \
//     3   1
//
//输出: 7
//解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.
//示例 2:
//
//输入: [3,4,5,1,3,null,1]
//     3
//    / \
//   4   5
//  / \   \
// 1   3   1
//
//输出: 9
//解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
//链接：https://leetcode-cn.com/problems/house-robber-iii
    public int rob3(TreeNode root) {
        if (root==null)
            return 0;
        int money = root.val;
        if (root.left!=null)
            money+=(rob3(root.left.left)+rob3(root.left.right));
        if (root.right!=null)
            money+=(rob3(root.right.left)+rob3(root.right.right));
        return Math.max(money,rob3(root.left)+rob3(root.right));
    }

    public int rob3_yoiuhua(TreeNode root){
        HashMap<TreeNode,Integer> memory= new HashMap<>();
        return help_rob(root,memory);
    }
    private int help_rob(TreeNode root, HashMap<TreeNode,Integer> memory){
        if (root==null)
            return 0;
        if (memory.containsKey(root))
            return memory.get(root);
        int money = root.val;
        if (root.left!=null)
            money+=(help_rob(root.left.left,memory)+help_rob(root.left.right,memory));
        if (root.right!=null)
            money+=(help_rob(root.right.left,memory)+help_rob(root.right.right,memory));
        int res= Math.max(money,help_rob(root.left,memory)+help_rob(root.right,memory));
        memory.put(root,res);
        return res;
    }
}

