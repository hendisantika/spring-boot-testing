package com.hendisantika.springboottesting.testing.web;

import com.hendisantika.springboottesting.testing.RegisterUseCase;
import com.hendisantika.springboottesting.testing.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.50
 */
@RestController
@RequiredArgsConstructor
class RegisterRestController {

    private final RegisterUseCase registerUseCase;

    @PostMapping("/forums/{forumId}/register")
    UserResource register(
            @PathVariable("forumId") Long forumId,
            @Valid @RequestBody UserResource userResource,
            @RequestParam("sendWelcomeMail") boolean sendWelcomeMail) {

        User user = new User(
                userResource.getName(),
                userResource.getEmail());
        Long userId = registerUseCase.registerUser(user, sendWelcomeMail);

        return new UserResource(
                user.getName(),
                user.getEmail());
    }
}
