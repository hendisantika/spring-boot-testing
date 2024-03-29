package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.domain.SaveUserPort;
import com.hendisantika.springboottesting.testing.domain.SendMailPort;
import com.hendisantika.springboottesting.testing.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.45
 */
@Service
@RequiredArgsConstructor
public class RegisterUseCase {

    private final SaveUserPort saveUserPort;

    private final SendMailPort sendMailPort;

    public Long registerUser(User user, boolean sendWelcomeMail) {
        user.setRegistrationDate(LocalDateTime.now());

        if (sendWelcomeMail) {
            sendMailPort.sendMail("Welcome!", "Thanks for registering.");
        }

        return saveUserPort.saveUser(user);
    }

}
