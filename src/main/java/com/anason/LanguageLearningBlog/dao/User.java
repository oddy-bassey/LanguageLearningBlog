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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
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

    //One-to-One Mapping
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @Column
    private Role role;  //related to the Role Class
    @Column
    private Date registeredAt;
    @Column
    private int status;


}
