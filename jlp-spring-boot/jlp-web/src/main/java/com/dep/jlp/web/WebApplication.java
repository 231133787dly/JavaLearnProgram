package com.dep.jlp.web;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 09:25:24
 */

@EnableJpaAuditing
@SpringBootApplication
@ForestScan(basePackages = "com.dep.jlp.web.common.request")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
