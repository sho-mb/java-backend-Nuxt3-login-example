package com.example.accountService.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accountService.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  <S extends User> S save(User user);
  Optional<User> findByLoginId(String loginId);

  Optional<User> findByEmail(String email);
  
  Optional<User> findByPassword(String password);
}
