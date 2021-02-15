package com.anason.LanguageLearningBlog.services;

import com.anason.LanguageLearningBlog.dao.Role;
import com.anason.LanguageLearningBlog.dao.User;
import com.anason.LanguageLearningBlog.dao.enums.RoleName;
import com.anason.LanguageLearningBlog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void findUserById(int userId) {
        userRepository.findById(userId);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }


}
