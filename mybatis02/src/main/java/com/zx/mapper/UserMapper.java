package com.zx.mapper;

import com.zx.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface UserMapper {
//   @Results({
//     @Result(property = "desc",column = "desc")
//   })
  @Select("select id,username,password from user_test where id=#{id}")
  public User selectUser(Integer id);

}
