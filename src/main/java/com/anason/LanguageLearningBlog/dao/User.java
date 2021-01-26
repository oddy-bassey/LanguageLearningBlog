package com.anason.LanguageLearningBlog.dao;

import com.anason.LanguageLearningBlog.dao.enums.Gender;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
public class User {

    @Column(name = "id")
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "profile_img")
    private String profileImg;

    //One-to-One Mapping
    @Column(name = "role")
    private Role role;  //related to the Role Class
    @Column(name = "registered_at")
    private Date registeredAt;
    @Column(name = "status")
    private int status;


}
