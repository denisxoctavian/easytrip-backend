package com.easytrip.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200", "https://easytrip-frontend.vercel.app"}, allowCredentials = "true")
@RestController
@RequestMapping("/wakeup")
public class RenderController {

    @GetMapping
    public String keepRenderAlive(){
        return "Wake up !";
    }
}
