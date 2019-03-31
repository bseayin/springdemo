package com.zz.service;

import com.zz.entity.User;

public interface UserService {
    User selectByNameAndPwd(User record);
}
