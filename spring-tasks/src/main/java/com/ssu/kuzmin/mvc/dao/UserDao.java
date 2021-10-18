package com.ssu.kuzmin.mvc.dao;

import com.ssu.kuzmin.mvc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
