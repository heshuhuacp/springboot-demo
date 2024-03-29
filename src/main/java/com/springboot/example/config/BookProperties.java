package com.springboot.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 1、@ConfigurationProperties只能从全局配置中读取配置
 /2、@PropertySource加载指定文件
 */
@Component
@PropertySource(value = {"classpath:config/book.properties"})
@ConfigurationProperties(prefix = "author")
public class BookProperties {

    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
