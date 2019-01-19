package com.ytt.jdk.TestPackge.packge1;

/**
 * Created by ytt on 2019/1/19.
 */
public class Tong {
    public static void main(String[] args) {
        Parent parent = new Parent();
        //parent.pPri(); //error：Tong 访问 parent 的 private
        parent.pDef();   //true: Tong 访问 parent 的 default。==== 同包访问
        parent.pPro();   //true:
    }
}
