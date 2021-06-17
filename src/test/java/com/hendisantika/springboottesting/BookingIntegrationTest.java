package com.hendisantika.springboottesting;

import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.32
 */
@SpringBootTest
class BookingIntegrationTest {

    @Autowired
    private WebApplicationContext applicationContext;

    @Autowired
    private CustomerRepository customerRepository;

    private MockMvc mockMvc;

}
