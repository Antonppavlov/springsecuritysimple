package ru.appavlov.springsecuritysimple.service;

import ru.appavlov.springsecuritysimple.model.User;

public interface IUserService {
    void save(User user);

    void findByUsername(String username);
}