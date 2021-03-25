package com.john.wiki.service;

import com.john.wiki.entity.Test;

import java.util.List;

/**
 * 测试类的Service
 *
 * @author constantinejohn
 */
public interface TestService {

    /**
     * 获取所有的test参数
     *
     * @return {@link List<Test>}
     */
    List<Test> list();

    /**
     * 根据 ID 获取对应的测试类
     *
     * @param id id
     * @return {@link Test}
     */
    Test getOneById(Integer id);

    /**
     * 插入新的Test
     *
     * @param test {@link Test}
     * @return {@link Boolean}
     */
    int insert(Test test);
}
