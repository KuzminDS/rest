package com.ssu.kuzmin.mvc.services;

import com.ssu.kuzmin.mvc.dao.UserDao;
import com.ssu.kuzmin.mvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(Integer id) {
        User user = getById(id);
        userDao.delete(user);
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
