package com.peppa.yec.demo.service;

/**
 * @author zyf
 */
public interface UserService {

    /**
     * 用户登陆
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

}
