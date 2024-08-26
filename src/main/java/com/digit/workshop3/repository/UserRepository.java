package com.digit.workshop3.repository;

import com.digit.workshop3.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
