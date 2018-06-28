package com.peppa.yec.demo.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author zyf
 */
public interface UserMapper {
    /**
     * 查找用户名是否存在
     * @param username
     * @return
     */
    Integer selectExistsUserName(String username);

    /**
     * 根据用户名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    String selectByUser(
            @Param("username")
            String username,
            @Param("password")
            String password);
}
