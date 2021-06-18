package com.hendisantika.springboottesting.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 06.03
 */
@SpringBootTest
@Import(Foo.class)
class SpringBootImportTest {

    @Autowired
    Foo foo;

    @Test
    void test() {
        assertThat(foo).isNotNull();
    }
}
