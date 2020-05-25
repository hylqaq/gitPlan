package com.baidu.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 功能概述:
 * @Author: Hyl.
 * @version: 1.0.
 * @Date: 2020/05/25.
 * @Copyright:
 */
@RestController
public class TestDemo {
    @GetMapping("/test")
    public String test(){
        return "testDemo";
    }
}
