package com.hendisantika.springboottesting.customer.data;

import com.hendisantika.springboottesting.booking.data.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void onlyCustomerRepositoryIsLoaded() {
        assertThat(customerRepository).isNotNull();
        assertThat(bookingRepository).isNull();
    }

    @Test
    void versionTest() {
        Customer hans = new Customer();
        hans.setName("Haruka");
        customerRepository.save(hans);
    }

}
