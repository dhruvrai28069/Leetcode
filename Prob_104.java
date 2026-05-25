public class Prob_104 {

    public class TreeNode {
        int val;
        Prob_104.TreeNode left;
        Prob_104.TreeNode right;

    }
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }
}