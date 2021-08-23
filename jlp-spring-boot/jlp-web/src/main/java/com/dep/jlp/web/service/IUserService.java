package com.dep.jlp.web.service;

import com.dep.jlp.web.common.dto.UserAccountDTO;
import com.dep.jlp.web.common.entity.User;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 09:26:24
 */

public interface IUserService {

    /**
     * 通过username查询用户
     *
     * @param userAccountDTO 插入的用户账号类
     * @return UserAccountDTO 返回插入的账号类
     */
    UserAccountDTO insertUser(UserAccountDTO userAccountDTO);
}
