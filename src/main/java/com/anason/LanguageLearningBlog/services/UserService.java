package com.anason.LanguageLearningBlog.services;

import com.anason.LanguageLearningBlog.dao.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveUser(User user);
    public Optional<User> findUserById(int userId);
    public List<User> getUsers();
    public void updateUser(User user);
    public void deleteUser(int userId);
}
