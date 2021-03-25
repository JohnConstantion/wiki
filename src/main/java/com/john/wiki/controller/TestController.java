package com.john.wiki.controller;

import com.john.wiki.entity.Test;
import com.john.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author constantinejohn
 */
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @PostMapping("/get_name")
    public String getName(String name) {
        return "名字是： " + name;
    }

    @GetMapping("/test/get_all")
    public List<Test> getAll() {
        return testService.list();
    }

    @GetMapping("/test/get_one")
    public Test getOne(Integer id) {
        return testService.getOneById(id);
    }

    @GetMapping("/test/insert")
    public int insert() {
        Test test = new Test();
        test.setName("w");
        test.setPassword("w");
        return testService.insert(test);
    }

}
