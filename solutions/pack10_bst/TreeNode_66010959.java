package solutions.pack10_bst;

public class TreeNode_66010959 {
    int data;
    TreeNode_66010959 left, right, parent;

    public TreeNode_66010959(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    @Override
    public String toString() {
        String leftChild = (left == null) ? "null" : Integer.toString(left.data);
        String rightChild = (right == null) ? "null" : Integer.toString(right.data);
        return leftChild + "<-" + data + "->" + rightChild;
    }
}
