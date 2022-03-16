package com.example.spring_boot_securitys.controller;

import com.example.spring_boot_securitys.entity.User;
import com.example.spring_boot_securitys.security.CurrentUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping("public")
    public String Test() {
        return "Hello public";
    }

    @GetMapping("user")
    public String TestU(@CurrentUser User user) {
        return "Hello user.  "+user.getUsername();
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("admin")
    public String TestA() {
        return "Hello admin";
    }

}
