package com.distributedconceptlearning.PresenceSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Setter
@Data
public class AuthResponse {
    private String token;
}
