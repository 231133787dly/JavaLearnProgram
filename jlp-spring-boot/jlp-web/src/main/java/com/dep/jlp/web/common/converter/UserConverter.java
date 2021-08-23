package com.dep.jlp.web.common.converter;

import com.dep.jlp.web.common.dto.UserAccountDTO;
import com.dep.jlp.web.common.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 16:10:11
 */

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserConverter {
    /**
     * 类型转换
     * @param userAccountDTO 用户账号DTO
     * @return
     */
    User toUser(UserAccountDTO userAccountDTO);

    /**
     * 类型转换
     * @param user 用户实体类
     * @return
     */
    UserAccountDTO toUserAccountDTO(User user);

}
