package com.hendisantika.springboottesting.customer;

import com.hendisantika.springboottesting.booking.business.BookingService;
import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.booking.web.BookingController;
import com.hendisantika.springboottesting.customer.business.CustomerService;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.customer.web.CustomerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.38
 */
@SpringBootTest
class CustomerModuleTest {

    @Autowired(required = false)
    private BookingController bookingController;
    @Autowired(required = false)
    private BookingService bookingService;
    @Autowired(required = false)
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerController customerController;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void onlyCustomerModuleIsLoaded() {
        assertThat(customerController).isNotNull();
        assertThat(customerService).isNotNull();
        assertThat(customerRepository).isNotNull();
        assertThat(bookingController).isNull();
        assertThat(bookingService).isNull();
        assertThat(bookingRepository).isNull();
    }
}
