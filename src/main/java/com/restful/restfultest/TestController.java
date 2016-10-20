/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.restfultest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Srinivasulu Kurva
 */

@RestController
public class TestController {
 
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping("/user")
    public User message() {//REST Endpoint.
        User u = new User();
        u.setName("ravi");
        u.setPassword("xxxx");
        return u;
    }
}