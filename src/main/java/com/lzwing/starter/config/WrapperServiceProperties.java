package com.lzwing.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类
 */
@ConfigurationProperties("wrapper.service")
public class WrapperServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
