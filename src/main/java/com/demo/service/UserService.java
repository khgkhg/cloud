package com.demo.service;

import com.demo.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    public User getUserById(String userId);

    public boolean addUser(User record);
    public boolean addUserno(User record);
    public PageInfo<User> getList(int pageNum,int pageSize);
}

