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
}
