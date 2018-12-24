package com.ytt.design_pattern.shi_pei_qi.leishipeiqi;

/**
 * Created by ytt on 2018/12/21.
 */
public class Client {
    public static void main(String[] args) {

        V3I v3;
        v3 = new Adaper();
        geiShouJiChongDian(v3);
    }

    public static void geiShouJiChongDian(V3I v3I){
        v3I.chongDian3();
        System.out.println("充满了");
    }
}
