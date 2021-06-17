package com.hendisantika.springboottesting.testing.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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
    UserEntity findByName(String name);

    @Query("select u from UserEntity u where u.name = :name")
    UserEntity findByNameCustomQuery(@Param("name") String name);

    @Query(value = "select * from user as u where u.name = :name", nativeQuery = true)
    UserEntity findByNameNativeQuery(@Param("name") String name);
}
