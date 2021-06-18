package com.hendisantika.springboottesting.testing.web;

import com.hendisantika.springboottesting.testing.RegisterUseCase;
import com.hendisantika.springboottesting.testing.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @PostMapping("/mvc/register/")
    ModelAndView register(@ModelAttribute("user") UserResource userResource) {

        User user = new User(
                userResource.getName(),
                userResource.getEmail());

        registerUseCase.registerUser(user, false);

        ModelAndView modelAndView = new ModelAndView("registration_success.html");
        modelAndView.addObject("username", user.getName());

        return modelAndView;
    }
}
