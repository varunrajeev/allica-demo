package com.example.allica.repository;

import com.example.allica.model.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Long> {

}
