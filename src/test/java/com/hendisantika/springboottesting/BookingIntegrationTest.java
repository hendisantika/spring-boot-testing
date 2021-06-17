package com.hendisantika.springboottesting;

import com.hendisantika.springboottesting.customer.data.Customer;
import com.hendisantika.springboottesting.customer.data.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.32
 */
@SpringBootTest
class BookingIntegrationTest {

    @Autowired
    private WebApplicationContext applicationContext;

    @Autowired
    private CustomerRepository customerRepository;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders
                .webAppContextSetup(applicationContext)
                .build();
    }

    @Test
    void bookFlightReturnsHttpStatusOk() throws Exception {
        this.customerRepository.save(Customer.builder()
                .name("Naruto")
                .build());

        this.mockMvc.perform(
                post("/booking")
                        .param("customerId", "1")
                        .param("flightNumber", "Oceanic 815"))
                .andExpect(status().isOk());
    }

}
