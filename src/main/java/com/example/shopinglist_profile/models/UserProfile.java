package com.example.shopinglist_profile.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @Column(name = "user_profile_id")
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String description;

    private String country;

    private String city;
}
