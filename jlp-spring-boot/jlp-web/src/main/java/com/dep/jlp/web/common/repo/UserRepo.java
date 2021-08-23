package com.dep.jlp.web.common.repo;

import com.dep.jlp.web.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 11:16:42
 */

public interface UserRepo extends JpaRepository<User,Long> {

//    /**
//     * 新增用户
//     * @param username 新增的用户名
//     * @param password 新增的密码
//     * @return
//     */
//    @Modifying
//    @Transactional
//    @Query(value = "insert into jlp_database_user values (:username,:password) ",nativeQuery = true)
//    public void insertUser(@Param("username") String username, @Param("password") String password);
}
