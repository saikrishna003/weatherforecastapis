package com.springboot.weatherapis.Utils;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;

@Component
public class JwtUtil {

    public static final String SECRET_KEY="";

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, username);
    }

    private String createToken(Map<String, Object> claims, String username) {
        Date now = new Date();
        Date validity = new Date(now.getTime() + 1000 * 60);
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(getKey(),SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getKey() {
    	byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
    	return Keys.hmacShaKeyFor(keyBytes);
	}

	public Boolean validateToken(String token, UserDetails userDetails) {
		String username = extractUsername(token);
	    boolean isTokenExpired = isTokenExpired(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired);
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
    	Claims claims =null;
    	try {
    		claims = extractAllClaims(token);
		} catch (ExpiredJwtException e) {
            throw new JwtException("Token has expired");
        } catch (UnsupportedJwtException e) {
            throw new JwtException("Token format is invalid");
        } catch (MalformedJwtException e) {
            throw new JwtException("Token is malformed");
        } catch (SignatureException e) {
            throw new JwtException("Token signature is invalid");
        } catch (IllegalArgumentException e) {
            throw new JwtException("Token is empty or null");
        }
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getKey()).build().parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }
}
