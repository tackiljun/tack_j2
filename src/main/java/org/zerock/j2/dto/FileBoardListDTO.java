package org.zerock.j2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileBoardListDTO {

    // 게시판 번호.
    private Long bno;
    //게시판 제목.
    private String title;
    // 이미지의 uuid.
    private String uuid;
    // 이미지의 파일이름.
    private String fname;

}
