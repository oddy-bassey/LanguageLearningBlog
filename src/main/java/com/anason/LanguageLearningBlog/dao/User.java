package com.anason.LanguageLearningBlog.dao;

import com.anason.LanguageLearningBlog.dao.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
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
    private String phoneNumber;

    @Column
    private Gender gender;

    @Column
    private String profileImage;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @Column
    private Role role;

    @Column
    private int status;
}
