package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUserIfNotExists(String userName, String password) {
        User newUser = new User();
        User user = userRepository.findUserByUserName(userName);
        if(user == null) {
            newUser.setUserName(userName);
            newUser.setPassword(password);
            userRepository.save(newUser);
        }
        return newUser;
    }

    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User getUserByName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    public User loginUser(String userName, String password) {
        User user = userRepository.findUserByUserName(userName);
        if(user == null) {
            return null; // todo
        } else {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            } else return null;
        }
    }
}
