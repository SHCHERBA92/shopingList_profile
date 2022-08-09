package com.example.shopinglist_profile.ModelsDTO;

import com.example.shopinglist_profile.models.UserProfile;
import org.modelmapper.ModelMapper;

public class SimpleConverterUser {
    private static ModelMapper modelMapper = new ModelMapper();

    static public UserProfileDTO convertUserProfileToDTO(UserProfile userProfile){
        return modelMapper.map(userProfile, UserProfileDTO.class);
    }

    static public UserProfile convertDTOtoUserProfile(UserProfileDTO profileDTO){
        return modelMapper.map(profileDTO, UserProfile.class);
    }

    static public UserProfileDTO convertUserProfileToDTO(UserProfileDTO oldUserProfileDTO, UserProfile userProfile){
        oldUserProfileDTO.setAge(userProfile.getAge());
        oldUserProfileDTO.setCity(userProfile.getCity());
        oldUserProfileDTO.setCountry(userProfile.getCountry());
        oldUserProfileDTO.setDescription(userProfile.getDescription());
        oldUserProfileDTO.setFirstName(userProfile.getFirstName());
        oldUserProfileDTO.setLastName(userProfile.getLastName());
        return oldUserProfileDTO;
    }
}
