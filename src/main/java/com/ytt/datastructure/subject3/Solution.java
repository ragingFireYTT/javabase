package com.ytt.datastructure.subject3;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by ytt on 2018/12/18.
 */
public class Solution {

    TreeNode head = new TreeNode(8);

    @Before
    public void init() {
        //初始化树
        head.left = new TreeNode(6).
                setLeft(new TreeNode(5)).setRight(new TreeNode(7));
        head.right = new TreeNode(10).
                setLeft(new TreeNode(9)).setRight(new TreeNode(11));
        head.print();
    }

    @Test
    public void text() {
//        递归测试
//        mirrorTree(head);
//        head.print();

//        非递归测试
//        mirrorTreeS(head);
//        head.print();

    }




    // ---------------------------------------------------------------------
    //递归实现
    public void mirrorTree(TreeNode head) {

        TreeNode.swapNode(head);
        if (head.right != null) {
            mirrorTree(head.right);
        }
        if (head.left != null) {
            mirrorTree(head.left);
        }
    }

    // 非递归实现--栈
    // 因为 每次 while 可能产生两个 ，需要处理交换的子节点。
    // 但是 while 循环每次只能处理一个，所以先使用 stack 将需要处理的节点先进行存储。
    public void mirrorTreeS(TreeNode head) {
        Stack<TreeNode> stack = new Stack<TreeNode>(); // 存储需要交换的节点
        stack.push(head);

        while (!stack.empty()){
            TreeNode pop = stack.pop();
            TreeNode.swapNode(pop);
            if (pop.right != null){
                stack.push(pop.right);
            }
            if (pop.left!=null) {
                stack.push(pop.left);
            }
        }
    }





    // -------------------------------------------------------------------
    // 树节点
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        // 方便，链式调用
        public TreeNode setRight(TreeNode right) {
            this.right = right;
            return this;
        }

        // 方便，链式调用
        public TreeNode setLeft(TreeNode left) {
            this.left = left;
            return this;
        }

        // 打印树
        // https://blog.csdn.net/zhang___yong/article/details/78932459
        public void print(){
            LinkedList<TreeNode> queue=new LinkedList<>();
            queue.add(this);
            TreeNode last=this;
            while(!queue.isEmpty()){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if (node==last) { // 同一层级节点结束
                    System.out.print(node.val+"\n");
                    if (!queue.isEmpty()){
                        last=queue.getLast();
                    }
                } else {
                    System.out.print(node.val+" ");
                }
            }
        }

        // 交换树节点
        public static TreeNode swapNode(TreeNode treeNode) {
            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
            return treeNode;
        }
    }
}




