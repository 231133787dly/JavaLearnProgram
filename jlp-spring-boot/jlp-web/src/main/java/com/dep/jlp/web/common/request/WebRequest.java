package com.dep.jlp.web.common.request;

import com.dep.jlp.core.util.Result;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 11:01:56
 */

@Component
public interface WebRequest {

    /**
     * 新增用户
     *
     * @param user 新增的用户
     * @return
     */
    @PostRequest(
            url = "${0}/api/web/user/signUp"
    )
    Result insertUserRequest(String url, @JSONBody Map<String, Object> user);
}
