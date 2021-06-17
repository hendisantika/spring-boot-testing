package com.hendisantika.springboottesting.booking.business;

import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.flight.data.FlightService;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.15
 */
public class BookingService {
    private final BookingRepository bookingRepository;

    private final CustomerRepository customerRepository;

    private final FlightService flightService;

    public BookingService(
            BookingRepository bookingRepository,
            CustomerRepository customerRepository,
            FlightService flightService) {
        this.bookingRepository = bookingRepository;
        this.customerRepository = customerRepository;
        this.flightService = flightService;
    }

}
