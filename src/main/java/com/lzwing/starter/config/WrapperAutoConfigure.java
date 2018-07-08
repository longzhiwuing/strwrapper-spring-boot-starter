package com.lzwing.starter.config;

import com.lzwing.starter.service.WrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(WrapperService.class)
@EnableConfigurationProperties(WrapperServiceProperties.class)
public class WrapperAutoConfigure {

    private final WrapperServiceProperties properties;

    @Autowired
    public WrapperAutoConfigure(WrapperServiceProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "wrapper.service", value = "enabled",havingValue = "true")
    WrapperService exampleService (){
        return  new WrapperService(properties.getPrefix(),properties.getSuffix());
    }

}
