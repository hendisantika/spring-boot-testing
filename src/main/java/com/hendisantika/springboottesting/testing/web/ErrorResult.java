package com.hendisantika.springboottesting.testing.web;

import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.46
 */
@Value
@NoArgsConstructor
public class ErrorResult {
    private final List<FieldValidationError> fieldErrors = new ArrayList<>();

    ErrorResult(String field, String message) {
        this.fieldErrors.add(new FieldValidationError(field, message));
    }
}
