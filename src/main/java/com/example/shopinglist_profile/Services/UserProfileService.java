package com.example.shopinglist_profile.Services;

import com.example.shopinglist_profile.models.UserProfile;
import com.example.shopinglist_profile.reposytories.UserProfileRepo;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    private final UserProfileRepo userProfileRepo;

    public UserProfileService(UserProfileRepo userProfileRepo) {
        this.userProfileRepo = userProfileRepo;
    }

    public UserProfile getUserById(Long id){
        return userProfileRepo.findById(id).orElse(new UserProfile(id,"","", 0,"","",""));
    }

}
