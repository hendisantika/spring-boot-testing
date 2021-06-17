package com.hendisantika.springboottesting.booking;

import com.hendisantika.springboottesting.booking.business.BookingService;
import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.customer.CustomerConfiguration;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.flight.FlightConfiguration;
import com.hendisantika.springboottesting.flight.data.FlightService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.01
 */
@Configuration
@Import({CustomerConfiguration.class, FlightConfiguration.class})
@ComponentScan
public class BookingConfiguration {

    @Bean
    public BookingService bookingService(
            BookingRepository bookingRepository,
            CustomerRepository customerRepository,
            FlightService flightService) {
        return new BookingService(bookingRepository, customerRepository, flightService);
    }

}
