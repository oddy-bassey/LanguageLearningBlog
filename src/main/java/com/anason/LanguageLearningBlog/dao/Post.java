package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "posts")
public class Post {

    @Column(name = "id")
    private int id;

    //Many to One mapping
    private User user;

    //Many to One mapping
    private Category category;

    @Column(name = "cover_image")
    private String coverImage;


    private Date created_At;
    private Date updated_At;
    private Date published_At;

    //Post state_Id
}
