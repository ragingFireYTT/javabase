package com.ytt.design_pattern.dai_li_mo_shi.jingtaidaili;

/**
 * Created by ytt on 2018/12/24.
 */
public class Client {
    public static void main(String[] args) {
        ProxySearcher proxySearcher = new ProxySearcher();
        proxySearcher.doSearch("杨过","玉女心经");
    }
}
