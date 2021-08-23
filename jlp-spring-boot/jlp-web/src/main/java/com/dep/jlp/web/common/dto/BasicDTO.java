package com.dep.jlp.web.common.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/23 16:00:10
 */

@MappedSuperclass
@Getter
@Setter
public class BasicDTO {
    private Long id;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    @Override
    public String toString() {
        return super.toString();
    }
}
