package com.dep.jlp.web.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 09:29:31
 */

@Entity
@Getter
@Setter
@Table(name = "jlp_web_user")
public class User extends BaseEntity {

    //用户名
    @Column(unique = true, nullable = false)
    private String username;

    //用户密码
    @Column(nullable = false)
    private String password;

    //用户邮箱
    @Column
    private String email;

    //用户手机号码
    @Column
    private String phone;

    //用户住址
    @Column
    private String address;
}
