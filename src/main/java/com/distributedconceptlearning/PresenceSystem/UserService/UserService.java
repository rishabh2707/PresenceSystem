package com.distributedconceptlearning.PresenceSystem.UserService;

import com.distributedconceptlearning.PresenceSystem.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User save(User user);
    Optional<User> findByUserName(String userName);
    User getById(UUID id);
}
