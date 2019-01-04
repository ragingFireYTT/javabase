package com.ytt.data_structure.teng_xun_te_tang.tree.tree_shunxu;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytt on 2018/12/29.
 */
public class Client {
    ArrayBinaryTree arrayBinaryTree ;
    @Before
    public void init(){
        arrayBinaryTree = new ArrayBinaryTree(new int[]{1,2,3,4,5,6,7});
    }
    @Test
    public void testQianXuShow(){
        arrayBinaryTree.qianXuShow();
    }
}
