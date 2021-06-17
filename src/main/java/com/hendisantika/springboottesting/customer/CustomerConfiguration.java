package com.hendisantika.springboottesting.customer;

import com.hendisantika.springboottesting.customer.business.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.03
 */
@Configuration
@ComponentScan
public class CustomerConfiguration {

    @Bean
    public CustomerService customerService() {
        return new CustomerService();
    }
}
