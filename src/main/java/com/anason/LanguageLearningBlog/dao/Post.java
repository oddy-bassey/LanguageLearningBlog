package com.anason.LanguageLearningBlog.dao;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "post")
public class Post {

    @Column(name = "id")
    private int id;
    //userId (call/links with the *User class)
    @Column(name = "user_id")
    private User userId;
    //categogyId (call/links with the *Category class)
    @Column(name = "category_id")
    private Category categoryId;
    @Column(name = "english_content")
    private String englishContent;
    @Column(name = "chinese_content")
    private String chineseContent;
    @Column(name = "cover_image")
    private String coverImage;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "title")
    private String postTitle;
    @Column(name = "published_at")
    private Date publishedAt;
    //stateId (call/links with the *PostState class)
    @Column(name = "state_id")
    private PostState stateId;
}
