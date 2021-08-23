package com.dep.jlp.web;

import com.dep.jlp.core.util.Result;
import com.dep.jlp.web.common.request.WebRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 10:21:50
 */

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
public class WebTest {
    @Autowired
    WebRequest webRequest;

    @Test
//    @Ignore
    public void insertUser() {
        //模拟前端给值
        Map<String, Object> map = new HashMap<>();
        map.put("username", "test01");
        map.put("password", "123456");

        //插入user
        Result result = webRequest.insertUserRequest("localhost:8080", map);
        log.info(result.toString());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>插入成功");
    }
}
