package com.fds.springboot.demo.repositories;

import com.fds.springboot.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
