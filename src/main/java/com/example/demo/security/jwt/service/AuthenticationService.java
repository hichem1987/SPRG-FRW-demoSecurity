package com.example.demo.security.jwt.service;

import com.example.demo.security.jwt.model.JwtAuthenticationResponse;
import com.example.demo.security.jwt.model.SignInRequest;
import com.example.demo.security.jwt.model.SignUpRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}