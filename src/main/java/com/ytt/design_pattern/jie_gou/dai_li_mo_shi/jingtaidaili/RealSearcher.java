package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jingtaidaili;

/**
 * Created by ytt on 2018/12/24.
 */
public class RealSearcher implements Searcher {
    public String doSearch(String userId, String keyWord) {
        System.out.println("用户'"+userId+"'使用关键词'"+keyWord+"'查询商务信息！");
        return "返回具体内容";
    }
}
