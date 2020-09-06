//给定一个二叉树，返回它的中序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2]
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 哈希表
// 👍 660 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.awt.*;
import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */




// 递归
class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(TreeNode t, List<Integer> r) {
        if (t != null) {
            if (t.left != null) {
                helper(t.left, r);
            }
            r.add(t.val);
            if (t.right != null) {
                helper(t.right, r);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
