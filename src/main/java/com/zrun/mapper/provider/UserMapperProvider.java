package com.zrun.mapper.provider;

import java.util.Map;

/**
 * Created by zhao_xuesong on 2016/10/31.
 */
public class UserMapperProvider {

    public String getProductList(Map<String,String> param){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM user where 1=1");
        // 拼接查询条件
        return sb.toString();
    }

}
