package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "contents")
public class Content {
    @Column(name = "id")
    private int id;
    // private Post post;
    // private Languages lang_Type;
    @Column(name = "content")
    private String content;
}
