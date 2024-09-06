/*
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

If no such second minimum value exists, output -1 instead.

 

 

Example 1:


Input: root = [2,2,5,null,null,5,7]
Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.
Example 2:


Input: root = [2,2,2]
Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.
 

Constraints:

The number of nodes in the tree is in the range [1, 25].
1 <= Node.val <= 231 - 1
root.val == min(root.left.val, root.right.val) for each internal node of the tree.

 */

 public class App {

    public static int findSecondMinimumValue(TreeNode root) {
        if (root == null){
            return -1;
        }
        if (root.left == null && root.right == null){
            return -1;
        }
        int left = root.left.val;
        int right = root.right.val;
        if(root.left.val == root.val){
            left = findSecondMinimumValue(root.left);
        }
        if(root.right.val == root.val){
            right = findSecondMinimumValue(root.right);
        } 
        if (left != -1 && right != -1){
            return Math.min(left, right);
        }
        if (left != -1 ){
            return left;
        }else{
            return right;
        }       
    }

    public static void main(String[] args) throws Exception {
        // This initilization is from ChatGPT
        TreeNode node7 = new TreeNode(7);
        TreeNode node5_right = new TreeNode(5, null, node7);
        TreeNode node5_left = new TreeNode(5);
        TreeNode node2_right = new TreeNode(2, node5_left, node5_right);
        TreeNode node2_left = new TreeNode(2);
        TreeNode tree = new TreeNode(2, node2_left, node2_right);
        // This initilization is from ChatGPT
        int secondSmallest = findSecondMinimumValue(tree);
        if (secondSmallest == -1){
            System.out.println("General error");
        }else {
            System.out.println("The second smallest value is: " + secondSmallest);
        }
    }

    
}
