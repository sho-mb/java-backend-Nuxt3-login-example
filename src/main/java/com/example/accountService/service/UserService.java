package com.example.accountService.service;

import com.example.accountService.model.entity.User;

import jakarta.validation.constraints.NotNull;

public interface UserService {
  User register(@NotNull User user);
}
