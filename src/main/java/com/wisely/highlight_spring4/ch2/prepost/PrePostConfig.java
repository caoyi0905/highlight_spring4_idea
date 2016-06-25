package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by FrozenC on 2016/6/25.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
