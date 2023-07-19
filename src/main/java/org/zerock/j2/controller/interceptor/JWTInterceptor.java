package org.zerock.j2.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.zerock.j2.util.JWTUtil;

@Log4j2
@RequiredArgsConstructor
@Component
public class JWTInterceptor implements HandlerInterceptor {

    private final JWTUtil jwtUtil;

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {

        log.info("------------------------------");
        log.info(handler);
        log.info("------------------------------");
        log.info(jwtUtil);
        log.info("------------------------------");
        log.info("------------------------------");

        return true;
    }
}
