package com.example.employeeManagement;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/admin") 
public class AdminController {
	@RequestMapping("/hello")
	 @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public String hello() {
        return "hello admin"; //RestController Return view is not possible.....
    }
}
