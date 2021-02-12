package com.anason.LanguageLearningBlog.dao;

import com.anason.LanguageLearningBlog.dao.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phoneNo;
    @Column
    private Gender gender;
    @Column
    private String profileImg;
    // roleId (calls/link with the class *Role not the enum *Roles)
    @Column
    @OneToOne(fetch =FetchType.EAGER,cascade  =CascadeType.DETACH)
    private Role role;
    @Column
    private Date registeredAt;
    @Column
    private int status;



}
