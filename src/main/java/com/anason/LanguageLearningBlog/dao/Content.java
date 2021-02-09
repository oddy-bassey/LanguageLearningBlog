package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "content")
public class Content {

    @Column(name = "id")
    private int id;
    //@Column(name = "post")
    //private Post post;
    //@Column(name = "lang_type")
    //private Language lang_Type;
    @Column(name = "content")
    private String content;
}
