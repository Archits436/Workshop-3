//package com.digit.workshop3.config;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import java.nio.charset.StandardCharsets;
//
//@Component
//public class JwtConfig {
//    private final SecretKey secretkey = Keys.hmacShaKeyFor("Hello-Ji".getBytes());
//
//    public Claims extractClaims(String token) {
//        return Jwts.parser().setSigningKey(secretkey).build().parseClaimsJws(token).getBody();
//    }
//}
