package com.hendisantika.springboottesting.customer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.07
 */
@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String hello() {
        return "hello ! " + LocalDateTime.now();
    }
}
