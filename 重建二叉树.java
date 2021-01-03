import java.util.HashMap;
import java.util.Map;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || preorder == null){
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<>();
        int length = inorder.length;
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, indexMap);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> indexMap) {
        if (preStart > preEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        if (preStart == preEnd) {
            return root;
        } else {
            int rootIndex = indexMap.get(rootVal);
            int leftNumbers = rootIndex - inStart;
            int rightNumbers = inEnd - rootIndex;
            TreeNode leftNode = buildTree(preorder, preStart+1, preStart+leftNumbers, inorder, inStart, rootIndex-1, indexMap);
            TreeNode rightNode = buildTree(preorder, preEnd-rightNumbers+1, preEnd, inorder, rootIndex+1, inEnd, indexMap);
            root.left = leftNode;
            root.right = rightNode;
            return root;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}