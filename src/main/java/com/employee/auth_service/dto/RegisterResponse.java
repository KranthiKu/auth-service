package com.employee.auth_service.dto;



import com.employee.auth_service.entity.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponse {

    private Long id;

    private String username;

    private String email;

    private Role role;

    private Boolean enabled;

}