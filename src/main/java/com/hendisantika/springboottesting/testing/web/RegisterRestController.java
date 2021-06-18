package com.hendisantika.springboottesting.testing.web;

import com.hendisantika.springboottesting.testing.RegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

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
}
