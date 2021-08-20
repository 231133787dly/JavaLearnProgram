package com.dep.jlp.basis.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 14:07:29
 */

/**
 * 尝试 @AllArgsConstructor 等lombok中的注解
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;

}
