package com.qzh.shirodemo.mapper;

import com.qzh.shirodemo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username") String username);
}
