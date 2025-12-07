package com.example.config;

import io.jsonwebtoken.*;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtUtil {

	private final String SECRET = "c3ByaW5nYm9vdGpzZWNyZXRrZXlmb3J0YXNrbWFuYWdlbWVudDI1Ng==";

    public String generateToken(String username, String role) {

        return Jwts.builder()
                .setSubject(username)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public Claims validateToken(String token) {

        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }
}
