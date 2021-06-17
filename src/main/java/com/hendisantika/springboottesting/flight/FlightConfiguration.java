package com.hendisantika.springboottesting.flight;

import com.hendisantika.springboottesting.flight.data.FlightService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.11
 */
@Configuration
@EnableScheduling
@ComponentScan
public class FlightConfiguration {

    @Bean
    public FlightService flightService() {
        return new FlightService();
    }
}
