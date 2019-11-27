package com.david.common.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version $Id: null.java, v 1.0 2019/9/23 5:24 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:自动配置类
 * @since 1.0
 **/
@Configuration
public class CommonAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DavidService davidService(){
        return new DavidService();
    }
}
