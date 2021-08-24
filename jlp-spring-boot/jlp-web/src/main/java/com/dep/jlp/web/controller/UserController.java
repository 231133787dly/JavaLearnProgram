package com.dep.jlp.web.controller;

import com.dep.jlp.core.util.Result;
import com.dep.jlp.web.common.dto.UserAccountDTO;
import com.dep.jlp.web.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 09:28:35
 */

@RestController
@RequestMapping("/api/web/user")
@AllArgsConstructor
public class UserController {
    IUserService userService;

    @PostMapping("/signUp")
    public Result signUp(@RequestBody UserAccountDTO userAccountDTO) {
        return Result.success(userService.insertUser(userAccountDTO));
    }

    @GetMapping("/getUser")
    public Result getUser(@RequestParam String username) {
        return Result.success(userService.getUserByUsername(username));
    }
}
