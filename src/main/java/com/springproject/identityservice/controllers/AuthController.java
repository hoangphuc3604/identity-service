package com.springproject.identityservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jose.JOSEException;
import com.springproject.identityservice.dto.request.APIResponse;
import com.springproject.identityservice.dto.request.AuthRequest;
import com.springproject.identityservice.dto.request.IntrospectRequest;
import com.springproject.identityservice.dto.response.AuthResponse;
import com.springproject.identityservice.dto.response.IntrospectResponse;
import com.springproject.identityservice.service.AuthService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.var;
import lombok.experimental.FieldDefaults;

import java.text.ParseException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthController {
    AuthService authService;

    @PostMapping("/login")
    APIResponse<AuthResponse> authenticate(@RequestBody AuthRequest request) {
        var data = authService.authenticate(request);
        return APIResponse.<AuthResponse>builder()
                .data(data)
                .build();
    }

    @PostMapping("/introspect")
    APIResponse<IntrospectResponse> introspect(@RequestBody IntrospectRequest request)
            throws JOSEException, ParseException {
        var data = authService.introspect(request);
        return APIResponse.<IntrospectResponse>builder()
                .data(data)
                .build();
    }
}
