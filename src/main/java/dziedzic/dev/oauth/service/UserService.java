package dziedzic.dev.oauth.service;

import dziedzic.dev.oauth.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    Optional<UserEntity> findByEmail(String email);
    void save(UserEntity user);
}
