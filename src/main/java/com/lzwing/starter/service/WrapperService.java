package com.lzwing.starter.service;

/**
 * 具体服务类
 *
 * @author chenzhongyong@cecdat.com
 */
public class WrapperService {

    private String prefix;
    private String suffix;

    public WrapperService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return String.format("%s%s%s", prefix, word, suffix);
    }
}
