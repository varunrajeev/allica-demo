package com.example.allica.dto;

import com.example.allica.model.UserDetailsEntity;

import java.util.Date;

public class UserDetailsDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public UserDetailsDto() {
    }

    public UserDetailsDto(UserDetailsEntity userDetailsEntity) {
        this.setId(userDetailsEntity.getId());
        this.setFirstName(userDetailsEntity.getFirstName());
        this.setLastName(userDetailsEntity.getLastName());
        this.setDateOfBirth(userDetailsEntity.getDateOfBirth());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserDetailsDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
