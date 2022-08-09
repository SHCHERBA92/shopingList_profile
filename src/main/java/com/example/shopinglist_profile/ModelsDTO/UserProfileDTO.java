package com.example.shopinglist_profile.ModelsDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDTO {
    private String firstName;

    private String lastName;

    private Integer age;

    private String description;

    private String country;

    private String city;

    private String email;

    private String nickName;
}
