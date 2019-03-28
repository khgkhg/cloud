package com.demo.service.imp;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Transactional(rollbackFor={RuntimeException.class})
    public boolean addUser(User record){
        boolean result = false;
            userMapper.insertSelective(record);
            if("2".equals(record.getId())){
                    throw new RuntimeException("报错需要回滚");
            }
            result = true;
        return result;
    }
    public boolean addUserno(User record){
        boolean result = false;
        try {
            userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public PageInfo<User> getList(int pageNum, int pageSize) {
       PageHelper.startPage(pageNum,pageSize);
        List<User>list = userMapper.getList();
        PageInfo<User> result = new PageInfo<>(list);
        return result;
    }
}