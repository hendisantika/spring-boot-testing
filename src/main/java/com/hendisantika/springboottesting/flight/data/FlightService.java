package com.hendisantika.springboottesting.flight.data;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.11
 */
public class FlightService {
    public Optional<Flight> findFlight(String flightNumber) {
        return Optional.of(Flight.builder()
                .airline("Garuda Indonesia")
                .flightNumber("212")
                .build());
    }
}
