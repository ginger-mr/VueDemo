package com.ginger.service;

import com.ginger.pojo.User;

import java.util.List;

public interface IUserService {

    /**
     * 查询用户列表
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
