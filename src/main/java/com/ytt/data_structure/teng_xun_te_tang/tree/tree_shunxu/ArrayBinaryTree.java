package com.ytt.data_structure.teng_xun_te_tang.tree.tree_shunxu;

/**
 * Created by ytt on 2018/12/29.
 *
 * 顺序存储树特性：
 *      1.
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void qianXuShow(){
        qianXuShow(0);
    }
    // 前序遍历
    // 第 n 个元素的，左子节点是：2*n+1
    // 第 n 个元素的，右子节点是：2*n+2
    // 第 n 个元素的，父节点是：（n-1）/2
    public void qianXuShow(int index){
        if (data == null || data.length == 0){
            return;
        }
        // 输出当前节点
        System.out.println(data[index]);
        // 左孩子树
        if ((2*index+1)<data.length){
            qianXuShow(2*index+1);
        }
        // 右孩子树
        if ((2*index+2)<data.length){
            qianXuShow(2*index+2);
        }
    }
}
