package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jingtaidaili;

/**
 * Created by ytt on 2018/12/24.
 *
 * 工具类 验证登录
 */
public class AccessValidator {

    //模拟实现登录验证
    public boolean Validate(String userId) {
        System.out.println(("在数据库中验证用户'" + userId + "'是否是合法用户？"));
        if (userId.equals("杨过")) {
            System.out.println(("'{" + userId + "}'登录成功！"));
            return true;
        } else {
            System.out.println(("'{" + userId + "}'登录失败！"));
            return false;
        }
    }
}
