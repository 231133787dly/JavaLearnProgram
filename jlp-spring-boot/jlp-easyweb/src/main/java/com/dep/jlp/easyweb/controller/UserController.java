package com.dep.jlp.easyweb.controller;

import com.dep.jlp.easyweb.common.entity.User;
import com.dep.jlp.easyweb.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 14:59:56
 */

@RestController
@RequestMapping("/api/easyWeb/user")
@AllArgsConstructor
public class UserController {
    IUserService userService;

    @GetMapping("/user-info")
    public User getUserByUsername(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }

}
