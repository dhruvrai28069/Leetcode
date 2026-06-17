import java.util.*;

class Prob_103 {

    public class TreeNode{
        int val;
        Prob_103.TreeNode left;
        Prob_103.TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(root, 0, result);

        for (int i = 1; i < result.size(); i += 2) {
            Collections.reverse(result.get(i));
        }

        return result;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);

        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);

    }
}