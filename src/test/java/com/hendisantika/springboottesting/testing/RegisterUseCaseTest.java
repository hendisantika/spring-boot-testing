package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.domain.SaveUserPort;
import com.hendisantika.springboottesting.testing.domain.SendMailPort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 05.59
 */
@ExtendWith(MockitoExtension.class)
class RegisterUseCaseTest {

    @Mock
    private SaveUserPort saveUserPort;

    @Mock
    private SendMailPort sendMailPort;

    private RegisterUseCase registerUseCase;

}
