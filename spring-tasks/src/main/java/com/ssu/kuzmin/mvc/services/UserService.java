package com.ssu.kuzmin.mvc.services;


import com.ssu.kuzmin.mvc.entities.User;

import java.util.List;

public interface UserService {
    User add(User user);
    User update(User user);
    void delete(Integer id);
    User getById(Integer id);
    List<User> getAll();
}
