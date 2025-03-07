package org.example.company;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    public TreeNode createTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, left, mid - 1);
        root.right = createTree(nums, mid + 1, right);
        return root;
    }
}
