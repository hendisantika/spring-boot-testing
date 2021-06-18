package com.hendisantika.springboottesting.testing.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.46
 */
@Data
public class FieldValidationError {

    private String field;

    private String message;

    public FieldValidationError(@JsonProperty("field") String field, @JsonProperty("message") String message) {
        this.field = field;
        this.message = message;
    }
}
