package com.hendisantika.springboottesting.testing.persistence;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.50
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
