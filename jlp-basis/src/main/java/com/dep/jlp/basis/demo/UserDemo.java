package com.dep.jlp.basis.demo;

import com.dep.jlp.basis.entity.User;
import lombok.extern.slf4j.Slf4j;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 14:12:20
 */

@Slf4j
public class UserDemo {
    /**
     * 尝试 @AllArgsConstructor 等lombok中的注解
     */
    public static void main(String[] args) {
        //尝试无参构造方法
        User user = new User();
        log.info(">>>>>>>>>>>>User:"+user);

        //尝试有参构造方法
        User userAll = new User(1L, "username", "password");
        log.info(">>>>>>>>>>>>User:"+userAll);
    }
}
