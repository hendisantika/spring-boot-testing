package com.hendisantika.springboottesting.booking.web;

import com.hendisantika.springboottesting.booking.business.BookingService;
import com.hendisantika.springboottesting.booking.data.Booking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.17
 */
@RestController
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/booking")
    public ResponseEntity<BookingResultResource> bookFlight(
            @RequestParam("customerId") Long customerId,
            @RequestParam("flightNumber") String flightNumber) {
        Booking booking = bookingService.bookFlight(customerId, flightNumber);
        BookingResultResource bookingResult = BookingResultResource.builder()
                .success(true)
                .build();
        return ResponseEntity.ok(bookingResult);
    }
}
