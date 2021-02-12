package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "comments")
public class Comment {

    @Column(name = "id")
    private int id;

    @Column(name = "user")
    private User user;    //Many-to-One Relational Mapping

    //private Post post;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_at")
    private Date created_At;

}
