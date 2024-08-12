package com.example.accountService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accountService.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 <S extends User> S save(User user);
}
