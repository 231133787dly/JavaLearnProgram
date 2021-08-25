package com.dep.jlp.web.common.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/25 16:51:08
 */

@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {
    private static final String DEFAULT_USERNAME = "anonymousUser";

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || auth.getPrincipal() == DEFAULT_USERNAME) {
            return Optional.of("system_account");
        }
        return Optional.ofNullable(auth.getName());
    }
}
