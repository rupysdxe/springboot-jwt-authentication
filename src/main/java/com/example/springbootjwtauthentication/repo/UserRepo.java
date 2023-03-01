package com.example.springbootjwtauthentication.repo;

import com.example.springbootjwtauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsr(String username);
}
