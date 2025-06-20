package com.threembank.application.service.token;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenProvider {
    TokenResult generate(UserDetails userDetails);
}
