package com.qzh.shirodemo.service;

import com.qzh.shirodemo.model.User;

public interface UserService {
    User findByUsername(String username);
}
