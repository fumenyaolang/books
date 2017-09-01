package com.fmyl.framework;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuzq on 17/8/29.
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
