package com.example.accountService.form;

import com.example.accountService.model.entity.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserCreateForm(
    @NotNull @Size(min = 8, max = 30) String loginId,
    @NotNull @Size(min = 8, max = 30) String password,
    @NotNull @Size(min = 3, max = 125) @Email String email) {
  public User toUser() {
        User user = User.builder()
        .loginId(loginId)
        .email(email)
        .password(password)
            .build();
        return user;        
      }
}
