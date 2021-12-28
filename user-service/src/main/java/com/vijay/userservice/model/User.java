package com.vijay.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
    @Id
    private long userId;
    private String firstName;
    private String lastName;
    private long departmentId;
}
