package com.qzh.shirodemo.service;

import com.qzh.shirodemo.mapper.UserMapper;
import com.qzh.shirodemo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Author DiangD
 * @Date 2020/2/8
 * @Version 1.0
 * @Description
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
