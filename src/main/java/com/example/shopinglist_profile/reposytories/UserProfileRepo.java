package com.example.shopinglist_profile.reposytories;

import com.example.shopinglist_profile.models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepo extends JpaRepository <UserProfile, Long>{
}
