package com.hendisantika.springboottesting.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.34
 */
@SpringBootTest(classes = BookingTestConfiguration.class)
class BookingTestConfigurationTest {

    @Autowired
    private ApplicationContext applicationContext;
}
