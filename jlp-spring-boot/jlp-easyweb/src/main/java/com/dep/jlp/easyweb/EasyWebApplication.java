package com.dep.jlp.easyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 14:55:51
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EasyWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyWebApplication.class, args);
    }
}
