package com.hendisantika.springboottesting.customer.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/06/21
 * Time: 09.06
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

}
