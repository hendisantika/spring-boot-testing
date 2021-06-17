package com.hendisantika.springboottesting.customer.web;

import com.hendisantika.springboottesting.booking.web.BookingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.41
 */
@WebMvcTest
class CustomerModuleWebLayerTests {

    @Autowired
    private CustomerController customerController;

    @Autowired(required = false)
    private BookingController bookingController;

}
