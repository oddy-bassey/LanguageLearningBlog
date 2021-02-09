package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "comment")
public class Comment {

    @Column(name = "id")
    private int id;
   // @Column(name = "post")
    //private Post post;
    //@Column(name = "user")
    //private User user;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_at")
    private Date created_At;
}
