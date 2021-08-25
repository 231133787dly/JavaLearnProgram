package com.dep.jlp.web.common.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/25 13:55:51
 */

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.
//                // <X> 使用内存中的 InMemoryUserDetailsManager
//                        inMemoryAuthentication()
//                // <Y> 使用 PasswordEncoder 密码编码器
//                .passwordEncoder(new BCryptPasswordEncoder())
//                // <Z> 配置 normal 用户,密码123
//                .withUser("normal").password("123").roles("NORMAL");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // <X> 配置请求地址的权限
                .authorizeRequests()
                .antMatchers("/api/web/user/signUp").permitAll() // 所有用户可访问
//                .antMatchers("/api/web/user/getUser").permitAll() // 所有用户可访问
                // 任何请求，访问的用户都需要经过认证
                .anyRequest().authenticated()
                .and()
                // <Y> 设置 Form 表单登录
                .formLogin()
//                    .loginPage("/login") // 登录 URL 地址
                .permitAll() // 所有用户可访问
                .and()
                // 配置退出相关
                .logout()
//                    .logoutUrl("/logout") // 退出 URL 地址
                .permitAll() // 所有用户可访问
                .and()
                .csrf().disable();//关闭跨域请求保护
    }

//    @Override
//    public void configure(WebSecurity web) {
//        //解决静态资源被拦截的问题
//        web.ignoring().antMatchers("/api/web/user/signUp");
//    }
}
