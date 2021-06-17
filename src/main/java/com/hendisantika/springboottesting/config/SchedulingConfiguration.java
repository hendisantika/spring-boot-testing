package com.hendisantika.springboottesting.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.20
 */
@Configuration
@EnableScheduling
@ConditionalOnProperty(
        name = "com.hendisantika.scheduling.enabled",
        havingValue = "true",
        matchIfMissing = true)
public class SchedulingConfiguration {
}
