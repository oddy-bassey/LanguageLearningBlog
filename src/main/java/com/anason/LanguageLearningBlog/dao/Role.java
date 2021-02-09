package com.anason.LanguageLearningBlog.dao;

import com.anason.LanguageLearningBlog.dao.enums.Roles;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="role")
public class Role {
    
    @Column(name="id")
    private int id;
    @Column(name="role")
    private Roles role;
}
