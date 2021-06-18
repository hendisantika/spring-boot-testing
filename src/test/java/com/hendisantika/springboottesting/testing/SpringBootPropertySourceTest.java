package com.hendisantika.springboottesting.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 06.05
 */
@SpringBootTest
@TestPropertySource(locations = "/foo.properties")
class SpringBootPropertySourceTest {

    @Value("${foo}")
    String foo;

    @Test
    void test() {
        assertThat(foo).isEqualTo("bar");
    }
}
