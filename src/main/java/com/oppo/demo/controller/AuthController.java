package com.oppo.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oppo.demo.model.User;
import com.oppo.demo.service.AuthService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<User> authenticate(@RequestBody User user) {
        return ResponseEntity.ok(authService.authenticate(user));

        // authority : 회원가입, 인가
        // authentication : 로그인 , 인증
        // auth
    }
    

}
