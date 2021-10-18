package com.ssu.kuzmin.mvc.controller.rest;

import com.ssu.kuzmin.mvc.entities.User;
import com.ssu.kuzmin.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List> getAllUsers() {
        List users = userService.getAll();
        if (users.isEmpty()) {
            return new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable(value = "id") Integer id) {
        User user = (User) userService.getById(id);
        if (user == null) {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody User user) {
        User userById = (User) userService.getById(user.getId());
        userService.add(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@RequestBody User user) throws Exception {
        User userById = (User) userService.getById(user.getId());
        if (userById != null) {
            userService.update(user);
            return new ResponseEntity<>(String.format("User with lastName = %s was updated.", user.getLastName()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(String.format("User with lastName = %s is not found.", user.getLastName()), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Integer id) {
        User userById = (User) userService.getById(id);
        if (userById == null) {
            return new ResponseEntity<>(String.format("User with id = %s is not existed.", id), HttpStatus.NOT_FOUND);
        }
        userService.delete(userById.getId());
        return new ResponseEntity<>(String.format("User with id = %s was deleted.", id), HttpStatus.OK);
    }
}
