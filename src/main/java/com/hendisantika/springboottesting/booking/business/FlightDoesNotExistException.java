package com.hendisantika.springboottesting.booking.business;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.14
 */
class FlightDoesNotExistException extends RuntimeException {

    FlightDoesNotExistException(String flightNumber) {
        super(String.format("A flight with ID '%d' doesn't exist!", flightNumber));
    }
}
