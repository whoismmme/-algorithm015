//根据一棵树的前序遍历与中序遍历构造二叉树。
//
// 注意:
//你可以假设树中没有重复的元素。
//
// 例如，给出
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//
// 返回如下的二叉树：
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// Related Topics 树 深度优先搜索 数组
// 👍 678 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return buildHelper(preorder, inorder, map, 0, n - 1, 0, n - 1);
    }

    public TreeNode buildHelper(int[] preorder, int[] inorder, Map<Integer, Integer> map, int
            pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right) {
            return null;
        }
        int pre_root = pre_left;
        int in_root = map.get(preorder[pre_root]);

        TreeNode root = new TreeNode(preorder[pre_root]);
        int left_subtree_size = in_root - in_left;

        root.left = buildHelper(preorder, inorder, map, pre_left + 1, pre_left +
                left_subtree_size, in_left, in_root - 1);
        root.right = buildHelper(preorder, inorder, map, pre_left + left_subtree_size + 1,
                pre_right, in_root + 1, in_right);
        return root;
    }
}
