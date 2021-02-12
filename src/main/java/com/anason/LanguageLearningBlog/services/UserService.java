package com.anason.LanguageLearningBlog.services;

import com.anason.LanguageLearningBlog.dao.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteById(int id);

    public void findUserById(int id);

    public List<User> getUsers();
}
