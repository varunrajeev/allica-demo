package com.example.allica.service;

import com.example.allica.dto.UserDetailsDto;
import com.example.allica.exception.AllicaException;
import com.example.allica.model.UserDetailsEntity;
import com.example.allica.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public UserDetailsDto getDetails(Long userId) {

        Optional<UserDetailsEntity> entityOptional = userDetailsRepository.findById(userId);

        if(entityOptional.isEmpty())
            throw new AllicaException("User does not exist");

        return new UserDetailsDto(entityOptional.get());

    }

    public void createUser(UserDetailsDto userDetailsDto) {

        UserDetailsEntity entity = new UserDetailsEntity();
        entity.setFirstName(userDetailsDto.getFirstName());
        entity.setLastName(userDetailsDto.getLastName());
        entity.setDateOfBirth(userDetailsDto.getDateOfBirth());

        userDetailsRepository.save(entity);

    }

}
