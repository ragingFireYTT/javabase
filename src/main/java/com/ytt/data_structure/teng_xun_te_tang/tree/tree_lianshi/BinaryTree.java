package com.ytt.data_structure.teng_xun_te_tang.tree.tree_lianshi;

import java.util.*;

/**
 * Created by ytt on 2018/12/27.
 */
public class BinaryTree {
    // 根节点
    TreeNode root;


    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    // 前序遍历
    public void formShow() {
        root.formShow();
    }

    // 中序遍历
    public void midShow() {
        root.midShow();
    }

    // 树形结构遍历
    public void print() {
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        linkedList.add(root);

        TreeNode last = root;
        List arr = new ArrayList();
        while (!linkedList.isEmpty()) {
            TreeNode current = linkedList.removeFirst();
            arr.add(current.value);
            if (current.getLeftTreeNode() == null) {

            } else {
                linkedList.add(current.getLeftTreeNode());
            }
            if (current.getRightTreeNode() == null) {

            } else {
                linkedList.add(current.getRightTreeNode());
            }
            if (current == last) {
                if (!linkedList.isEmpty()) {
                    last = linkedList.getLast();
                }
                System.out.println(Arrays.toString(arr.toArray()));
                arr = new ArrayList();
            }
        }
    }

    // 前序遍历
    public TreeNode searchQian(int value) {
        return root.searchQian(value);
    }

    public boolean deleteTreeNode(int value) {
        if (root.value == value) {
            root = null;
            return true;
        }
        return root.deleteTreeNode(value);
    }

}
