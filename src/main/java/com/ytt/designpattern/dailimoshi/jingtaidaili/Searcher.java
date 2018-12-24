package com.ytt.designpattern.dailimoshi.jingtaidaili;

/**
 * Created by ytt on 2018/12/24.
 *
 * 抽象查询类，被代理类的顶级接口
 */
public interface Searcher {
    public String doSearch(String userId,String keyWord);
}
