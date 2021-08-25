package com.dep.jlp.web.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/25 14:26:30
 */
public class EncodeUtil {
    public static void main(String[] args) {
        //模拟加密
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123"));
    }
}
