

## Medium
二叉树的最近公共祖先（Facebook 在半年内面试常考）

从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）
- O(n) & O(n)
- Preorder = root-left-right
- inorder = left-root-right
根据 preorder 的 root val，构建 inorder indexmap，找到对应 root 在 inorder 中的 index


组合（微软、亚马逊、谷歌在半年内面试中考过）

全排列（字节跳动在半年内面试常考）
- Backtrack method. 
- 时间复杂度较高，O(n*n!)



全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）
