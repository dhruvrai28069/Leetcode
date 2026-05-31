import java.util.*;

public class Prob_700 {

    public class TreeNode {
        int val;
        Prob_700.TreeNode left;
        Prob_700.TreeNode right;

    }

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null) return root;
        if(root.val == val) return root;

        if(root.val < val){
            return searchBST(root.right, val);
        }
        else{
            return searchBST(root.left, val);
        }

    }
}