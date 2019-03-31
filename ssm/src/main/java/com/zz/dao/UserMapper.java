package com.zz.dao;

import com.zz.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User selectByNameAndPwd(User record);
    @Select("select * from user where name=#{aa}")
    List<User> selectByName(String aa);

    @Select("select * from user where sex=#{param1} and age=#{param2}")
    List<User> selectBySexAge(String aa,Integer bb);

    @Select("select * from user where sex=#{sex} and age=#{age}")
    List<User> selectBySexAge2(User user);

    @Select("select * from user where name=#{aa}")
    @Results({@Result(property = "productId", column = "product_id"),
            @Result(property = "name", column = "name")
            })
    List<User> selectByName2(String aa);



}