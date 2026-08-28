import java.util.*;

public class Prob_257 {

    class TreeNode {
        int val;
        Prob_257.TreeNode left;
        Prob_257.TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {

        path += node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path + "->", paths);
        }
        if (node.right != null) {
            dfs(node.right, path + "->", paths);
        }
    }
}
