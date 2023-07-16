package org.zerock.j2.dto;

import lombok.Data;


@Data
public class ProductListDTO {
    // 목록 가져오는 DTO.

    private Long pno;
    private String pname;
    private int price;
    
    private String fname;

    private long reviewCnt;

    private double reviewAvg;
}
