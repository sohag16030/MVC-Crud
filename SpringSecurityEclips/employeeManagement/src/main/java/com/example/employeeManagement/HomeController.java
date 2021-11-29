package com.example.employeeManagement;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user") 
public class HomeController {
	
    @RequestMapping("/hello")
    @PreAuthorize("hasAnyRole('ROLE_USER') or hasAnyRole('ROLE_ADMIN')")
    public String hello() {
        return "hello user"; //RestController Return view is not possible.....
    }
}
