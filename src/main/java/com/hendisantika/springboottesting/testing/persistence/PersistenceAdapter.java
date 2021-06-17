package com.hendisantika.springboottesting.testing.persistence;

import com.hendisantika.springboottesting.testing.domain.SaveUserPort;
import com.hendisantika.springboottesting.testing.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/06/21
 * Time: 05.48
 */
@Component
public class PersistenceAdapter implements SaveUserPort {

    private final UserRepository userRepository;

    public PersistenceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long saveUser(User user) {
        UserEntity userEntity = new UserEntity(
                user.getName(),
                user.getEmail());
        UserEntity savedUserEntity = userRepository.save(userEntity);
        return savedUserEntity.getId();
    }

    public User loadUser(Long id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getEmail(),
                userEntity.getRegistrationDate());
    }
}
