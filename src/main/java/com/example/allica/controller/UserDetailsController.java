package com.example.allica.controller;

import com.example.allica.dto.ResponseObject;
import com.example.allica.dto.UserDetailsDto;
import com.example.allica.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user-details")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/{userId}")
    public ResponseObject<UserDetailsDto> getUserDetails(@PathVariable("userId") Long userId) {
        UserDetailsDto userDetailsDto = userDetailsService.getDetails(userId);
        return new ResponseObject<>("Success", userDetailsDto);
    }

    @PostMapping("/create")
    public ResponseObject createUserDetails(@RequestBody UserDetailsDto userDetailsDto) {
        userDetailsService.createUser(userDetailsDto);
        return new ResponseObject<>("Success", null);
    }

}
