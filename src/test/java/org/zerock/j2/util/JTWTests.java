package org.zerock.j2.util;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@SpringBootTest
@Log4j2
public class JTWTests {

    @Autowired
    private JWTUtil jwtUtil;

    @Test
    public void testCreate() {

        Map<String, Object> claim = Map.of("email", "user@aaa.com");

        String jwtStr = jwtUtil.generate(claim, 10);

        System.out.println(jwtStr);
    }

    @Test
    public void testToken() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6InVzZXJAYWFhLmNvbSIsImlhdCI6MTY4OTc0NDQwMywiZXhwIjoxNjg5NzQ1MDAzfQ.Wj3D16uPU5TvLtnhKDHKlKV7ggkk9Xs6ePYxqPUC6oM";

        try {

            jwtUtil.validateToken(token);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
