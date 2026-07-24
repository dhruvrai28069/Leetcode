public class Prob_108 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return constructBST(nums, 0, nums.length - 1);
        }

        private TreeNode constructBST(int[] nums, int left, int right) {
            // Base case: if the pointers cross, the subtree is empty
            if (left > right) {
                return null;
            }

            // Find the middle element to maintain height balance
            int mid = left + (right - left) / 2;

            // Create the root node with the middle element
            TreeNode node = new TreeNode(nums[mid]);

            // Recursively build the left and right subtrees
            node.left = constructBST(nums, left, mid - 1);
            node.right = constructBST(nums, mid + 1, right);

            return node;
        }
    }
}
