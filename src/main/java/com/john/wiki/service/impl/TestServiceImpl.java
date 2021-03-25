package com.john.wiki.service.impl;

import com.john.wiki.entity.Test;
import com.john.wiki.mapper.TestMapper;
import com.john.wiki.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author constantinejohn
 */
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<Test> list() {
        return testMapper.selectAllTest();
    }

    @Override
    public Test getOneById(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Test test) {
        return testMapper.insert(test);
    }
}
