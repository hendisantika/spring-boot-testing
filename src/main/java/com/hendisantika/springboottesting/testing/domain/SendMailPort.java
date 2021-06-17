package com.hendisantika.springboottesting.testing.domain;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.47
 */
public interface SendMailPort {

    void sendMail(String subject, String text);
}
