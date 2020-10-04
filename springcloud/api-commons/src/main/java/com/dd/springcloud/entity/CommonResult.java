package com.dd.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.dd.springcloud.entities.entities
 * @ClassName: CommonResult
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 17:19
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
