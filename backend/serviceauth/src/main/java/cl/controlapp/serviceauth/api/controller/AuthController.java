package cl.controlapp.serviceauth.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/ping")
    public String ping() {
        return "auth ok";
    }
    @PostMapping("/login")
    public String login() {
        return "Login endpoint OK";
    }
}