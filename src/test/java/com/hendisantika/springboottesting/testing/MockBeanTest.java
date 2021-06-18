package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.domain.User;
import com.hendisantika.springboottesting.testing.persistence.UserEntity;
import com.hendisantika.springboottesting.testing.persistence.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

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

    @Test
    void testRegister() {
        // given
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");
        boolean sendWelcomeMail = true;
        given(userRepository.save(any(UserEntity.class))).willReturn(userEntity(1L));

        // when
        Long userId = registerUseCase.registerUser(user, sendWelcomeMail);

        // then
        assertThat(userId).isEqualTo(1L);
    }

    private UserEntity userEntity(Long id) {
        return new UserEntity(id, "Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp", LocalDateTime.now());
    }

}
