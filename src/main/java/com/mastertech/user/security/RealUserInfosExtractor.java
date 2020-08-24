package com.mastertech.user.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import java.util.Map;

public class RealUserInfosExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        RealUserInfos user= new RealUserInfos();

        user.setId((Integer) map.get("id"));
        user.setName((String) map.get("name"));

        return user;
    }
}