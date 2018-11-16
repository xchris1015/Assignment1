package io.chris.training.DataStructure;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;

    public TreeNode(int value){
        this.value=value;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(6);
        root.left=node1;
        root.right=node2;
    }
}