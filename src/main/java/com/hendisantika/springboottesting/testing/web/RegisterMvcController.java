package com.hendisantika.springboottesting.testing.web;

import com.hendisantika.springboottesting.testing.RegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.49
 */
@Controller
@RequiredArgsConstructor
class RegisterMvcController {

    private final RegisterUseCase registerUseCase;
}
