package ru.appavlov.springsecuritysimple.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.appavlov.springsecuritysimple.dao.RoleDAO;
import ru.appavlov.springsecuritysimple.dao.UserDAO;
import ru.appavlov.springsecuritysimple.model.Role;
import ru.appavlov.springsecuritysimple.model.User;

import java.util.HashSet;
import java.util.Set;

@Log
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        Set<Role> roles = new HashSet<>();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        userDAO.save(user);
    }

    @Override
    public void findByUsername(String username) {
        userDAO.findByUsername(username);
    }
}
