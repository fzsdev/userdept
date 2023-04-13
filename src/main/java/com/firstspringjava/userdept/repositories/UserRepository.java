package com.firstspringjava.userdept.repositories;

import com.firstspringjava.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
