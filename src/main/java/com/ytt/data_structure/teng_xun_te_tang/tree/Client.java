package com.ytt.data_structure.teng_xun_te_tang.tree;

/**
 * Created by ytt on 2018/12/27.
 */
public class Client {
    public static void main(String[] args) {

        // 创建 二叉树
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        TreeNode rootL = new TreeNode(2);
        root.setLeftTreeNode(rootL);
        rootL.setLeftTreeNode(new TreeNode(4)
                .setLeftTreeNode(new TreeNode(8)).setRightTreeNode(new TreeNode(9)));
        rootL.setRightTreeNode(new TreeNode(5)
                .setLeftTreeNode(new TreeNode(10)).setRightTreeNode(new TreeNode(11)));


        TreeNode rootR = new TreeNode(3);
        root.setRightTreeNode(rootR);
        rootR.setLeftTreeNode(new TreeNode(6)
                .setLeftTreeNode(new TreeNode(12)).setRightTreeNode(new TreeNode(13)));
        rootR.setRightTreeNode(new TreeNode(7)
                .setLeftTreeNode(new TreeNode(14)).setRightTreeNode(new TreeNode(15)));


        binaryTree.formShow();
        System.out.println("===========");
        binaryTree.midShow(); // 8 4 9 2 10 5 11 1    12 6 13    3 14 7 15

        System.out.println("++++++++++++");
        binaryTree.print();

        System.out.println("++++++++++++");
        TreeNode treeNode = binaryTree.searchQian(10);
        System.out.println(treeNode != null ? treeNode.value : treeNode);
    }
}


