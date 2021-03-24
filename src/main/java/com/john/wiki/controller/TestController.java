package com.john.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author constantinejohn
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
