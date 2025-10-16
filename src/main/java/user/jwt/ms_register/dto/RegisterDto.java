package user.jwt.ms_register.dto;

import user.jwt.ms_register.entity.user.UserRole;

public record RegisterDto(String name, String email, String password, UserRole role) {
}
