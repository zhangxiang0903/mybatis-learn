package com.zx.mybatis.mapper;

import com.zx.mybatis.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("select id,username,password from user_test where id = #{id}")
    public User selectUser(Integer id);
}
