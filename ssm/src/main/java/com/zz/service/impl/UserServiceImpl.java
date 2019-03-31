package com.zz.service.impl;

import com.zz.dao.UserMapper;
import com.zz.entity.User;
import com.zz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User selectByNameAndPwd(User user) {
        return userMapper.selectByNameAndPwd(user);
    }

    @Override
    public List<User> selectByName(String aa) {
        return userMapper.selectByName(aa);
    }

    @Override
    public List<User> selectBySexAge(Integer bb, String aa) {
        return userMapper.selectBySexAge(aa,bb);
    }
}
