package com.hendisantika.springboottesting.booking.data;

import com.hendisantika.springboottesting.customer.data.Customer;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.02
 */
@Entity
@Data
@Builder
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Customer customer;

    @Column
    private String flightNumber;

}
