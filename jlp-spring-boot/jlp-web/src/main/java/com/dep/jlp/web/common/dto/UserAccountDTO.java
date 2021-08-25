package com.dep.jlp.web.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 15:58:54
 */

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountDTO extends BasicDTO {
    //用户名
    private String username;
    //密码
    private String password;
}
