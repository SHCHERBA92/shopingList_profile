package com.example.shopinglist_profile.controllers;

import com.example.shopinglist_profile.ModelsDTO.SimpleConverterUser;
import com.example.shopinglist_profile.ModelsDTO.UserProfileDTO;
import com.example.shopinglist_profile.Services.UserProfileService;
import org.modelmapper.Converter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@RestController
public class ProfileController {

    private final UserProfileService userProfileService;

    public ProfileController(UserProfileService userProfileService){
        this.userProfileService = userProfileService;
    }

    private UserProfileDTO currentUserForModel = null;

    @PostMapping(value = "profile/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String postProfile(@PathVariable Long userId,
                             @RequestBody UserProfileDTO o) {
        currentUserForModel = SimpleConverterUser.convertUserProfileToDTO(o, userProfileService.getUserById(userId));
        return "redirect:/currentProfile";
    }

    @GetMapping("currentProfile")
    public String getProfile(){
        return "start_of_profile";
    }

}
