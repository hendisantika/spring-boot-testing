package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.43
 */
@SpringBootTest
class MockBeanTest {

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private RegisterUseCase registerUseCase;

}
