package com.dep.jlp.web.service.impl;

import com.dep.jlp.web.common.converter.UserConverter;
import com.dep.jlp.web.common.dto.UserAccountDTO;
import com.dep.jlp.web.common.entity.User;
import com.dep.jlp.web.common.repo.UserRepo;
import com.dep.jlp.web.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 09:33:00
 */

@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements IUserService {
    private final UserRepo userRepo;
    private final UserConverter userConverter;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserAccountDTO insertUser(UserAccountDTO userAccountDTO) {
        User userResult = userRepo.saveAndFlush(userConverter.toUser(userAccountDTO));
        return userConverter.toUserAccountDTO(userResult);
    }

}
