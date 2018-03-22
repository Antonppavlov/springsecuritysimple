package ru.appavlov.springsecuritysimple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.appavlov.springsecuritysimple.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
