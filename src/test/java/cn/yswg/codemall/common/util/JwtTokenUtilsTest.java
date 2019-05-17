package cn.yswg.codemall.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JwtTokenUtilsTest {

    @Autowired
    private JwtTokenUtils jwtTokenUtils;

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 从token中获取JWT的负载
     */
    @Test
    public void  getClaimsFromToken(){
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1NTgwNzU1MDUwNjYsImV4cCI6MTU1ODY4MDMwNX0.NhXnSzmKxySdYQGontj64qLvybzmzvG-5h1DBsMoaiOL1L2ElFLyOAJhplWznFRJSXHkEcS7H5G3pCtheFG8qA";
        Claims mySecret = Jwts.parser()
                .setSigningKey("mySecret")
                .parseClaimsJws(token)
                .getBody();
        System.out.println(mySecret);
    }


    /**
     * 交易token是否有效
     */
    @Test
    public void validateToken(){
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1NTgwNzU1MDUwNjYsImV4cCI6MTU1ODY4MDMwNX0.NhXnSzmKxySdYQGontj64qLvybzmzvG-5h1DBsMoaiOL1L2ElFLyOAJhplWznFRJSXHkEcS7H5G3pCtheFG8qA";
        String username = jwtTokenUtils.getUserNameFromToken(token);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        boolean b = jwtTokenUtils.validateToken(token, userDetails);
        System.out.println(b);
    }

    /**
     * 根据用户信息生成token
     */
    @Test
    public void generateToken(){

    }
}