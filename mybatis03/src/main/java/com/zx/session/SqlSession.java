package com.zx.session;

public interface SqlSession {
    <T> T selectOne(String var1, Object var2);
}
