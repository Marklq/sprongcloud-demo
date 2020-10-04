package com.dd.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Package: com.dd.springcloud.entities
 * @ClassName: Payment
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 17:17
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;


}
