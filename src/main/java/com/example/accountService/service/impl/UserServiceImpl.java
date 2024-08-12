package com.example.accountService.service.impl;

import java.util.Optional;

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


  @Override
  public User findUserByLoginId(@NotNull String loginId) {
    Optional<User> optUser = userRepository.findByLoginId(loginId);
    if (optUser.isPresent()) {
      return optUser.get();
    } else {
      throw new Error();
    }
  }

  @Override
  public User findUserByEmail(@NotNull String email) {
    Optional<User> optUser = userRepository.findByEmail(email);
    if (optUser.isPresent()) {
      return optUser.get();
    } else {
      throw new Error();
    }
  }


  @Override
  public User findUserByPassword(@NotNull String password) {
    Optional<User> optUser = userRepository.findByPassword(password);
    if (optUser.isPresent()) {
      return optUser.get();
    } else {
      throw new RuntimeException();
    }
  }


  @Override
  public User reset(long id, String newPassword) {
    Optional<User> optUser = userRepository.findById(id);
    if (optUser.isPresent()) {
      User user = optUser.get();
      user.setPassword(newPassword);
      return userRepository.save(user);
    } else {
      throw new RuntimeException();
    }
  }
}
