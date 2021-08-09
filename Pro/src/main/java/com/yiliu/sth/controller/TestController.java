package com.yiliu.sth.controller;

import com.yiliu.sth.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Test
 *
 */
@Slf4j
@RequestMapping("/test")
@RestController
public class TestController {

    //默认日志配置
    //private final Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/index")
    public void getIndex(){


        //userService.alterPasswd("pixar","123456","123");

        //System.out.println(userService.getAcList());

        //System.out.println("Test Something~~~~");
        log.info("----------------默认日志配置------------------");
    }
}
