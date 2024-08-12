package com.example.accountService.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.accountService.dao.UserRepository;
import com.example.accountService.model.entity.User;
import com.example.accountService.service.UserService;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  @Override
  public User register(@NotNull User user) {
    return userRepository.save(user);
  }

}
