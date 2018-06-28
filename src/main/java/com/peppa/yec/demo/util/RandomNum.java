package com.peppa.yec.demo.util;

import org.apache.commons.lang.math.RandomUtils;

/**
 * @author zyf
 * 2018.06.23
 * 取得随机数
 */
public class RandomNum {

    public static Integer getNum(){
        return RandomUtils.nextInt(1000000000);
    }

}
