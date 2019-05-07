package com.zx;


import com.zx.mapper.UserMapper;
import com.zx.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-mybatis.xml"})
@Slf4j
public class MybatisTest2 {
  @Autowired
  private UserMapper userMapper;
  @Test
  public void testUserMapper() {
    User selectUser = userMapper.selectUser(1);
    log.error("user:{}",selectUser);
    System.err.println(selectUser);
  }
}
