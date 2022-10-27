package com.hzh.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @NAME: DefaultFeignConfiguration
 * @USER: DaHuangGO
 * @DATE: 2022/10/26
 * @TIME: 13:56
 * @YEAR: 2022
 * @MONTH: 10
 * @DAY: 26
 */
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
