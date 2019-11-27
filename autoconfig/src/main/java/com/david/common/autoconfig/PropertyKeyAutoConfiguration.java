package com.david.common.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version $Id: null.java, v 1.0 2019/9/24 10:42 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:property key 关键配置
 * @since 1.0
 **/
@Configuration
public class PropertyKeyAutoConfiguration {

    @Bean
    @ConditionalOnProperty(name = "propertyhaskey")
    @ConditionalOnMissingBean(value = PropertyKeyService.class)
    public PropertyKeyService propertyKeyService(){
        return new PropertyKeyService();
    }
}
