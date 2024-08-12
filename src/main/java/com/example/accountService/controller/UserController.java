package com.example.accountService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accountService.form.UserCreateForm;
import com.example.accountService.model.entity.User;
import com.example.accountService.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @GetMapping
  public void helloworld() {
    System.err.println("helloworld");
  }

  @PostMapping("/register")
  public User save(@RequestBody @Valid UserCreateForm user) {
    return userService.register(user.toUser());
  }
}
