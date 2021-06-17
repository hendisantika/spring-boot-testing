package com.hendisantika.springboottesting.booking.business;

import com.hendisantika.springboottesting.booking.data.Booking;
import com.hendisantika.springboottesting.booking.data.BookingRepository;
import com.hendisantika.springboottesting.customer.data.Customer;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import com.hendisantika.springboottesting.flight.data.Flight;
import com.hendisantika.springboottesting.flight.data.FlightService;

import java.util.Optional;

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

    /**
     * Books the given flight for the given customer.
     */
    public Booking bookFlight(Long customerId, String flightNumber) {

        Optional<Customer> customer = customerRepository.findById(customerId);
        if (!customer.isPresent()) {
            throw new CustomerDoesNotExistException(customerId);
        }

        Optional<Flight> flight = flightService.findFlight(flightNumber);
        if (!flight.isPresent()) {
            throw new FlightDoesNotExistException(flightNumber);
        }

        Booking booking = Booking.builder()
                .customer(customer.get())
                .flightNumber(flight.get().getFlightNumber())
                .build();

        return this.bookingRepository.save(booking);
    }
}
