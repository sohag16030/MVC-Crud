package com.example.employeeManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/no-auth")
public class NoAuthController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello"; //RestController Return view is not possible.....
    }
}
