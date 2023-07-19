package org.zerock.j2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private String email;

    //@JsonIgnore
    private String pw;

    private String nickname;

    private boolean admin;
    // 이게 JSON데이터로 바뀔꺼야.
    // 지난주에 만들었던 이니셜스테이트의 내용이 얘네가 될거야.
    // 쿠키로 저장할꺼야.
    // jsonformat / jsonignore.

    private String accessToken;

    private String refreshToken;
}
