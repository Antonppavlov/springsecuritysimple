package ru.appavlov.springsecuritysimple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.appavlov.springsecuritysimple.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {

}
