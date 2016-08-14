package com.naturalprogrammer.spring.ms.sample.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sanjay on 14-08-2016.
 */
@RestController
public class RevokeTokenController {

    @Autowired
    private ConsumerTokenServices tokenService;

    @PostMapping("/revoke-token")
    public String revoke(@RequestBody String token) {

        tokenService.revokeToken(token);
        return "Success";
    }

}
