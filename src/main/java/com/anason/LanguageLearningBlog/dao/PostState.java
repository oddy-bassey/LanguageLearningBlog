package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "post_state")
public class PostState {

    @Column(name = "id")
    private int id;
    @Column(name = "state_name")
    private String stateName;
}
