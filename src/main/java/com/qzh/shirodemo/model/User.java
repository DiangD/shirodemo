package com.qzh.shirodemo.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName User
 * @Author DiangD
 * @Date 2020/2/7
 * @Version 1.0
 * @Description
 **/
@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private Set<Role> roles = new HashSet<>();
}
