public class Prob_701{

    public class TreeNode{
        int val;
        Prob_701.TreeNode left;
        Prob_701.TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val){

        if(root == null) return new TreeNode(val);

        TreeNode temp = root;
        while(true){
            if(temp.val < val){
                if(temp.right != null){
                    temp = temp.right;
                }
                else{
                    temp.right = new TreeNode(val);
                    break;
                }
            }
            else{
                if(temp.left != null){
                    temp = temp.left;
                }
                else{
                    temp.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}