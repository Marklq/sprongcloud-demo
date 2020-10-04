package com.dd.springcloud.entity;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Package: com.dd.springcloud.entity
 * @ClassName: dd
 * @Author: 东方不败
 * @CreateTime: 2020-10-04 15:20
 * @Description:
 */
public class dd {

    public static void main(String[] args) {
        //雪花算法的长度有41位
        System.out.println("11111111111111111111111111111111111111111".length());

        //转换成十进制之后的数
        Long num = 2199023255551L;


        Date date = new Date();
        date.setTime(num);

        //计算可以使用到什么时期才能将这个序列填满
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }
}
