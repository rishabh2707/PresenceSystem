package com.distributedconceptlearning.PresenceSystem.controller;

import com.distributedconceptlearning.PresenceSystem.auth.CustomUserDetailsService;
import com.distributedconceptlearning.PresenceSystem.auth.JwtUtil;
import com.distributedconceptlearning.PresenceSystem.model.AuthRequest;
import com.distributedconceptlearning.PresenceSystem.model.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));

        UserDetails user = userDetailsService.loadUserByUsername(request.getUserName());
        String token = jwtUtil.generateToken(user);
        return new AuthResponse(token);
    }
}
