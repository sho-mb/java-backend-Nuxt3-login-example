package com.example.accountService.form;

import com.example.accountService.model.entity.User;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserPasswordUpdateForm(
  @NotNull @Size(min = 8, max = 30) String password)
  {
    
  }
