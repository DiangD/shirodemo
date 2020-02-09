package com.qzh.shirodemo.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Role
 * @Author DiangD
 * @Date 2020/2/7
 * @Version 1.0
 * @Description
 **/
@Data
public class Role {
    private Integer rid;
    private String rname;
    private Set<Permission> permissions = new HashSet<>();
    private Set<User> users = new HashSet<>();
}
