package com.hendisantika.springboottesting.testing.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.49
 */
@Value
public class UserResource {

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    private LocalDateTime registrationDate;

    public UserResource(
            @JsonProperty("name") String name,
            @JsonProperty("email") String email) {
        this.name = name;
        this.email = email;
        this.registrationDate = null;
    }
}
