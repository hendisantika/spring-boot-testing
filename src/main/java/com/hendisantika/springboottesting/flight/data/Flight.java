package com.hendisantika.springboottesting.flight.data;

import lombok.Builder;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.12
 */
@Data
@Builder
public class Flight {

    private String flightNumber;

    private String airline;
}
