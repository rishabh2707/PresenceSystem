package com.distributedconceptlearning.PresenceSystem.UserService;

import com.distributedconceptlearning.PresenceSystem.model.User;

import java.util.UUID;

public interface UserService {
    User save(User user);
    User findByUserName(String userName);
    User getById(UUID id);
}
