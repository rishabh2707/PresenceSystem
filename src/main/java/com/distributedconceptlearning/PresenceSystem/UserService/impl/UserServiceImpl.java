package com.distributedconceptlearning.PresenceSystem.UserService.impl;

import com.distributedconceptlearning.PresenceSystem.UserService.UserService;
import com.distributedconceptlearning.PresenceSystem.model.User;
import com.distributedconceptlearning.PresenceSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User getById(UUID id) {
        return userRepository.getById(id);
    }
}
