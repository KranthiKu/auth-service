package com.employee.auth_service.dto;




import com.employee.auth_service.entity.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {

    private String token;

    private String type;

    private String username;

    private String email;

    private Role role;
}