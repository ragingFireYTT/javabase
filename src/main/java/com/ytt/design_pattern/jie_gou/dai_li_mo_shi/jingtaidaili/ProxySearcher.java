package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jingtaidaili;

/**
 * Created by ytt on 2018/12/24.
 * <p>
 * 带理类。。 管理实际类。。
 */
public class ProxySearcher implements Searcher {

    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator;

    // 控制 实际类的调用。 （包括增强，修改等）
    public String doSearch(String userId, String keyWord) {
        validate(userId);
        return realSearcher.doSearch(userId, keyWord);
    }

    private boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.Validate(userId);
    }
}
