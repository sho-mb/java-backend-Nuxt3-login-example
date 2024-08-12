package com.example.accountService.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.accountService.form.UserCreateForm;
import com.example.accountService.form.UserPasswordUpdateForm;
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

  @GetMapping("/find")
  public User findUserByLoginIdOrEmail(
      @RequestParam(name = "loginId", required = false) Optional<String> loginId,
      @RequestParam(name = "email", required = false) Optional<String> email,
      @RequestParam(name = "password", required = false) Optional<String> password
  ) {
    if (loginId.isPresent()) {
      return userService.findUserByLoginId(loginId.get());
    } else if (email.isPresent()) {
      return userService.findUserByEmail(email.get());
    } else if (password.isPresent()) {
      return userService.findUserByPassword(password.get());
    } else {
        throw new IllegalArgumentException("Either loginId or email or password must be provided");
    }
  }

  @PostMapping("/register")
  public User save(@RequestBody @Valid UserCreateForm user) {
    return userService.register(user.toUser());
  }

  @PatchMapping("/reset/{id}")
  public User resetPassword(
      @PathVariable long id,
      @RequestBody String newPassword) {
    return userService.reset(id, newPassword);
  }
}
