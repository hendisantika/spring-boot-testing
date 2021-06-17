package com.hendisantika.springboottesting.booking.business;

import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.flight.data.FlightService;
import org.mockito.Mockito;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.27
 */
class BookingServiceTest {
    private final CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);

    private final FlightService flightService = Mockito.mock(FlightService.class);

    private final BookingRepository bookingRepository = Mockito.mock(BookingRepository.class);

    private BookingService bookingService;
}
