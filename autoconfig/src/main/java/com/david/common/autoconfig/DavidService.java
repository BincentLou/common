package com.david.common.autoconfig;

/**
 * @version $Id: null.java, v 1.0 2019/9/23 5:52 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:普通的类
 * @since 1.0
 **/
public class DavidService {


    public String getName(){
        return "自动配置启动";
    }

    @Override
    public String toString() {
        return "自动配置了"+super.toString();
    }
}
