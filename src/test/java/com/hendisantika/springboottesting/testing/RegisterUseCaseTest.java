package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.domain.SaveUserPort;
import com.hendisantika.springboottesting.testing.domain.SendMailPort;
import com.hendisantika.springboottesting.testing.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

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

    @BeforeEach
    void initUseCase() {
        registerUseCase = new RegisterUseCase(saveUserPort, sendMailPort);
    }

    @Test
    void savedUserHasRegistrationDate() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");
        when(saveUserPort.saveUser(any(User.class))).thenReturn(42L);
        Long userId = registerUseCase.registerUser(user, false);
        assertThat(userId).isNotNull();
    }

}
