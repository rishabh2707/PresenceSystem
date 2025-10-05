package com.distributedconceptlearning.PresenceSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class AuthRequest {
    private String userName;
    private String password;
}
