public class Prob_110 {

    public class TreeNode {
        int val;
        Prob_110.TreeNode left;
        Prob_110.TreeNode right;

    }

    public int height(TreeNode root) {

        if (root == null) return 0;

        int lh = height(root.left);
        if (lh == -1) return -1;

        int rh = height(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }

    public boolean isBalanced(TreeNode root) {

        int ans = height(root);
        if (ans == -1) return false;
        else return true;
    }

}
