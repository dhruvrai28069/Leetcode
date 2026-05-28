public class Prob_124 {

    public class TreeNode {
        int val;
        Prob_124.TreeNode left;
        Prob_124.TreeNode right;

    }

    int maxi = Integer.MIN_VALUE;
    public int Path(TreeNode root) {

        if (root == null) return 0;
        int left = Math.max(Path(root.left), 0);
        int right = Math.max(Path(root.right), 0);
        maxi = Math.max(maxi, root.val + left + right);
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {

        Path(root);
        return maxi;
    }
}