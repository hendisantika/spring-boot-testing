package com.hendisantika.springboottesting.testing.mail;

import com.hendisantika.springboottesting.testing.domain.SendMailPort;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.47
 */
@Component
public class MailingAdapter implements SendMailPort {

    @Override
    public void sendMail(String subject, String text) {
        // sending a mail...
    }
}
