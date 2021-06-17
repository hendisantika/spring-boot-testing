package com.hendisantika.springboottesting.booking;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
//@Import({CustomerConfiguration.class, FlightConfiguration.class})
@ComponentScan
public class BookingConfiguration {

//    @Bean
//    public BookingService bookingService(
//            BookingRepository bookingRepository,
//            CustomerRepository customerRepository,
//            FlightService flightService) {
//        return new BookingService(bookingRepository, customerRepository, flightService);
//    }

}
