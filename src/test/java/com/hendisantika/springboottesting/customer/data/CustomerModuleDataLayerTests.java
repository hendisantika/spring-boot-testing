package com.hendisantika.springboottesting.customer.data;

import com.hendisantika.springboottesting.booking.data.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.39
 */
@DataJpaTest
class CustomerModuleDataLayerTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired(required = false)
    private BookingRepository bookingRepository;

}
