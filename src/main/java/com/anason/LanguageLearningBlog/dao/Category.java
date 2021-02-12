package com.anason.LanguageLearningBlog.dao;

import com.anason.LanguageLearningBlog.dao.enums.Categories;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "categories")
public class Category {
    @Column(name = "id")
    private int id;

    @Column(name = "category")
    private Categories category;
}
