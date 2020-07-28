package com.lagou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lxg
 * @Description: ${todo}
 * @date 2020/7/1120:31
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicatoin8761 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatoin8761.class,args);
    }
}
