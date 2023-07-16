package org.zerock.j2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member_cart", indexes = @Index(columnList = "email, cno"))
public class MemberCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cno;

    private String email;

    private Long pno;

    // 수량, 상태도 들어가. - 삭제될건지 아닌지.

    // 시간이 추가되어야 한다.

}
