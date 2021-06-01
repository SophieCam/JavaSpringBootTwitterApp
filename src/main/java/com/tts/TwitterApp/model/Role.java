package com.tts.TwitterApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //lombark (no need for getters and setters and constructors)
@Builder // a lombark property
@AllArgsConstructor //specifying what constructors you want in boilerplate
@NoArgsConstructor
@Entity //class will be treated as a table in our database
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    private String role;



}
