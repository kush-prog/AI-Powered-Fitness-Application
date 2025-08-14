package com.fitness.gateway.user;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String Id;
    private String kwyCloakId;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

}
