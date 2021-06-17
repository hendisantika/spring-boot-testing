package com.hendisantika.springboottesting.booking.business;

import com.hendisantika.springboottesting.booking.data.Booking;
import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.flight.data.FlightService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

    @BeforeEach
    void setup() {
        this.bookingService = new BookingService(bookingRepository, customerRepository, flightService);
    }

    @Test
    void bookFlightReturnsBooking() {
        when(customerRepository.findById(42L)).thenReturn(customer());
        when(flightService.findFlight("Oceanic 815")).thenReturn(flight());
        when(bookingRepository.save(eq(booking()))).thenReturn(booking());
        Booking booking = bookingService.bookFlight(42L, "Oceanic 815");

        assertThat(booking).isNotNull();
        verify(bookingRepository).save(eq(booking));

    }
}
