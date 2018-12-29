package com.ytt.data_structure.teng_xun_te_tang.tree;

/**
 * Created by ytt on 2018/12/27.
 */
public class TreeNode {
    int value; // 节点的权
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;


    public TreeNode(int i) {
        this.value = i;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public TreeNode setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
        return this;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public TreeNode setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
        return this;
    }

    // 前序 遍历
    public void formShow() {
        System.out.println(value);
        if (leftTreeNode != null) {
            leftTreeNode.formShow();
        }
        if (rightTreeNode != null) {
            rightTreeNode.formShow();
        }
    }

    // 中序 遍历
    public void midShow() {
        if (leftTreeNode != null) {
            leftTreeNode.midShow();
        }
        System.out.println(value);
        if (rightTreeNode != null) {
            rightTreeNode.midShow();
        }
    }

    //前序搜索
    public TreeNode searchQian(int value) {
        TreeNode result = null;
        if (this.value == value) {
            return this;
        } else {
            //查询左节点
            if (this.getLeftTreeNode() != null) {
                result = this.getLeftTreeNode().searchQian(value);
            }

            if (result != null) {
                return result;
            }

            // 查询右节点
            if (this.getRightTreeNode() != null) {
                result = this.getRightTreeNode().searchQian(value);
                return result;
            }
        }
        return null;
    }


}
