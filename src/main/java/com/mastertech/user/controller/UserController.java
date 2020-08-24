package com.mastertech.user.controller;

import com.mastertech.user.model.User;
import com.mastertech.user.security.RealUserInfos;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/{alias}")
    public User create(@PathVariable String alias, @AuthenticationPrincipal RealUserInfos realUser) {
        User user = new User();
        user.setAlias(alias);
        user.setName(realUser.getName());
        return user;
    }
}