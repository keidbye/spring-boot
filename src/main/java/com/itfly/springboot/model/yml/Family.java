package com.itfly.springboot.model.yml;


import com.itfly.springboot.config.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
// 使用spring boot 导入application.yml 的配置
@ConfigurationProperties(prefix = "family")
// 导入自定义的配置
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
public class Family {

    private String familyName;
    private  Father father;
    private  Mother mother;
    private  Child child;
}
