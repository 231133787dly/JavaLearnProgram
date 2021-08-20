package com.dep.jlp.easyweb.service.impl;

import com.dep.jlp.easyweb.common.entity.User;
import com.dep.jlp.easyweb.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 15:12:31
 */

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User getUserByUsername(String username) {
        User user = new User();
        user.setId(1L);
        user.setUsername("username");
        user.setPassword("password");
        return user;
    }
}
