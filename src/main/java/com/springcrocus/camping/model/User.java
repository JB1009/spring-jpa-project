package com.springcrocus.camping.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long userNumber;
    @Column(length = 30, nullable = false)
    private String userId;
    @Column(nullable = false)
    private String userPassword;
    @Column(length = 30, nullable = false)
    private String userName;
    @Column(length = 50, nullable = false)
    private String userEmail;
    @Column(length = 13, nullable = false)
    private String userTel;
    @Column(nullable = false)
    private Date userBirth;
    @Column(length = 5, nullable = false)
    private String userGender;
    @Column(length = 1, nullable = false)
    private int userGrade;
    @Column(length = 30)
    private String userNickname;
    @CreationTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp userJoinDate;
    @Column(length = 15)
    private String userConnectionIp;
}
