package com.example.accountService.service;

import com.example.accountService.model.entity.User;

import jakarta.validation.constraints.NotNull;

public interface UserService {
  User register(@NotNull User user);

  User findUserByLoginId(@NotNull String loginId);

  User findUserByEmail(@NotNull String email);
  
  User findUserByPassword(@NotNull String password);

  User reset(long id, String newPassword);
}
