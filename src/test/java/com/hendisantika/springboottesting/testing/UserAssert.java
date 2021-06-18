package com.hendisantika.springboottesting.testing;

import com.hendisantika.springboottesting.testing.domain.User;
import org.assertj.core.api.AbstractAssert;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/06/21
 * Time: 06.06
 */
public class UserAssert extends AbstractAssert<UserAssert, User> {

    public UserAssert(User user) {
        super(user, UserAssert.class);
    }

    public static UserAssert assertThat(User actual) {
        return new UserAssert(actual);
    }

    public UserAssert hasRegistrationDate() {
        isNotNull();
        if (actual.getRegistrationDate() == null) {
            failWithMessage("Expected user to have a registration date, but it was null");
        }
        return this;
    }
}
