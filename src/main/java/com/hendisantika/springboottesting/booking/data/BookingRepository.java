package com.hendisantika.springboottesting.booking.data;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.09
 */
public interface BookingRepository extends CrudRepository<Booking, Long> {
}
