package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "category")
public class Category {

    @Column(name = "id")
    private int id;
    @Column(name = "category_name")
    private String categoryName;
}
