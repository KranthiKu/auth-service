package com.employee.auth_service.service;

import com.employee.auth_service.dto.LoginRequest;
import com.employee.auth_service.dto.LoginResponse;
import com.employee.auth_service.dto.RegisterRequest;
import com.employee.auth_service.dto.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);
    LoginResponse login(LoginRequest request);




}
