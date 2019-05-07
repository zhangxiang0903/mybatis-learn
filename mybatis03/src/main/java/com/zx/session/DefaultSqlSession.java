package com.zx.session;

import com.zx.executor.Executor;

public class DefaultSqlSession implements SqlSession {
    private SqlSession sqlSession;
    private Executor executor;

    public <T> T selectOne(String var1, Object var2) {
        return null;
    }
}
