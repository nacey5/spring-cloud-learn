package com.hzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @NAME: EurekaServerApplication
 * @USER: DaHuangGO
 * @DATE: 2022/10/25
 * @TIME: 1:24
 * @YEAR: 2022
 * @MONTH: 10
 * @DAY: 25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
