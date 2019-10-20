package com.zero.demo.controller;

import com.zero.demo.entity.User;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String get() {
        User user = new User();
        user.setId();
        return user.toString();
    }
}

