package com.anason.LanguageLearningBlog.services;

import com.anason.LanguageLearningBlog.dao.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void findUserById(int userId);
    public List<User> getAllUsers();
    public void updateUser(User user);
    public void deleteUser(int userId);
}
