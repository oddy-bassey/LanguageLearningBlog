package com.anason.LanguageLearningBlog.repositories;


import com.anason.LanguageLearningBlog.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
