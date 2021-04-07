package com.taikang.nacos;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableZuulProxy
public class ProviderApplicaion {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicaion.class,args);
    }
}
