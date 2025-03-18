package com.easytrip.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200", "https://easytrip-frontend.vercel.app"}, allowCredentials = "true")
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public Map<String, Object> getUserInfo(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
}
