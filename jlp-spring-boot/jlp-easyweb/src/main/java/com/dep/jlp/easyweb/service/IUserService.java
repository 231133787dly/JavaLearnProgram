package com.dep.jlp.easyweb.service;

import com.dep.jlp.easyweb.common.entity.User;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 15:00:05
 */
public interface IUserService {

    /**
     * 通过username查询用户
     *
     * @param username 用户名
     * @return User 用户信息
     */
    User getUserByUsername(String username);
}
